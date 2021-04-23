package com.projectmanagementreact.web;

import com.projectmanagementreact.domain.Project;
import com.projectmanagementreact.services.MapValidationErrorService;
import com.projectmanagementreact.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private MapValidationErrorService validationErrorService;

    @PostMapping("")
    public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project, BindingResult result) {

        ResponseEntity<Map<String, String>> errorMap = validationErrorService.getMapResponseEntity(result);
        if (errorMap != null) return errorMap;

        projectService.saveOrUpdateProject(project);
        //Explicit type argument Project can be replaced with <>
        return new ResponseEntity<>(project, HttpStatus.CREATED);

    }



}
