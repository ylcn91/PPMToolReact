package com.projectmanagementreact.web;

import com.google.gson.*;
import com.projectmanagementreact.domain.FormData;
import com.projectmanagementreact.services.FormServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/form")
public class FormController {

    @Autowired
    FormServices formServices;

    private FormData getFormData(String message) {
        JsonArray jsonObject = JsonParser.parseString(message).getAsJsonArray();
        FormData form = new FormData();
        form.setData(jsonObject.toString());
        return form;
    }

    @PostMapping(value = "",produces = "application/json")
    public ResponseEntity<?> createForm(@RequestBody String message) {
        FormData form = getFormData(message);
        formServices.save(form);
        return new ResponseEntity<>(form.getData(), HttpStatus.CREATED);
    }

    @GetMapping(value = "/{formId}",produces = "application/json")
    //{projectId} --> String projectId should match
    public ResponseEntity<?> getFormById(@PathVariable Long formId) {
        FormData formData = getFormData(formServices.getOne(formId).getData());
        return new ResponseEntity<>(formData.getData(),HttpStatus.OK);
    }

    @GetMapping("all")
    public Iterable<FormData> getAllForm() {
        return formServices.findAllForm();
    }

}
