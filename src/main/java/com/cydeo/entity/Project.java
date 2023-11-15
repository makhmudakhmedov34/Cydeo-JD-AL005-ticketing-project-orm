package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "projects")
public class Project extends BaseEntity{

    private String projectName;
    private String projectCode;
    @ManyToOne(fetch=FetchType.EAGER, cascade = CascadeType.PERSIST)
    private User assignedManager;
    @Column(columnDefinition = "DATE")
    private LocalDate startDate;
    @Column(columnDefinition = "DATE")
    private LocalDate endDate;
    private String projectDetail;
    @Enumerated(value = EnumType.STRING)
    private Status projectStatus;
    private Integer completeTaskCounts;
    private Integer unfinishedTaskCounts;

}
