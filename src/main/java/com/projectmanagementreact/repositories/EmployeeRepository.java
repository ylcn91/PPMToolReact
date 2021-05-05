package com.projectmanagementreact.repositories;

import com.projectmanagementreact.domain.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {


    Employee findByErpNo(String erpNo);

    @Override
    Iterable<Employee> findAll();


}

