package com.projectmanagementreact.web;

import com.projectmanagementreact.domain.Employee;
import com.projectmanagementreact.domain.Project;
import com.projectmanagementreact.services.EmployeeService;
import com.projectmanagementreact.services.MapValidationErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    private MapValidationErrorService validationErrorService;

    @PostMapping("")
    public ResponseEntity<?> createNewEmployee(@Valid @RequestBody Employee employee, BindingResult result) {

        ResponseEntity<Map<String, String>> errorMap = validationErrorService.getMapResponseEntity(result);
        if (errorMap != null) return errorMap;
        employeeService.saveOrUpdateProject(employee);

        return new ResponseEntity<>(employee, HttpStatus.CREATED);

    }

}
