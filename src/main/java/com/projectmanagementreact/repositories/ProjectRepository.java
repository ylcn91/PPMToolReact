package com.projectmanagementreact.repositories;

import com.projectmanagementreact.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {


    Project findByProjectIdentifier(String projectId);

    @Override
    Iterable<Project> findAll();
}
