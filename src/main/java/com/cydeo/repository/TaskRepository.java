package com.cydeo.repository;

import com.cydeo.entity.Task;
import com.cydeo.entity.User;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {

    @Query("SELECT COUNT (t) from Task t where t.project.projectCode=?1 and t.project.projectStatus<>'Completed'")
    int totalNonCompletedTasks(String projectCode);

    @Query(value = "SELECT count(*) FROM tasks t join projects p on t.project_id = p.project_id where p.project_code =?1 and t.task_status = 'COMPLETED'",nativeQuery = true)
    int totalCompletedTasks(String projectCode);
}
