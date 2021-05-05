package com.projectmanagementreact.services;

import com.projectmanagementreact.domain.Employee;
import com.projectmanagementreact.domain.Project;
import com.projectmanagementreact.exceptions.EmployeeIdException;
import com.projectmanagementreact.exceptions.ProjectIdException;
import com.projectmanagementreact.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService  {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveOrUpdateProject(Employee employee) {

        try {
            return employeeRepository.save(employee);
        } catch (Exception e) {
            throw  new EmployeeIdException("Employe Erpno: '" + employee.getErpNo() +"' already exist.");
        }

    }

}
