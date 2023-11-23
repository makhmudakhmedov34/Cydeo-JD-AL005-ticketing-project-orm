package com.cydeo.service;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.entity.User;

import java.util.List;

public interface ProjectService {

    List<ProjectDTO> listAllProjects();
    ProjectDTO findByProjectCode(String projectCode);
    void save(ProjectDTO projectDTO);
    void update(ProjectDTO dto);
    void deleteByProjectCode(String projectCode);
    void delete(String username);
    void complete(String projectCode);


    List<ProjectDTO> listAllProjectDetails();

    List<ProjectDTO> readAllByAssignedManager(User assignManager);
}
