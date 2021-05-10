package com.projectmanagementreact.repositories;

import com.projectmanagementreact.domain.FormData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends CrudRepository<FormData,Long> {

    @Override
    Iterable<FormData> findAll();
}
