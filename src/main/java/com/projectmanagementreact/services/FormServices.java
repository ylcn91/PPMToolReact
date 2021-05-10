package com.projectmanagementreact.services;


import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.projectmanagementreact.domain.FormData;
import com.projectmanagementreact.repositories.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormServices  {

    @Autowired
    FormRepository formRepository;

    public FormData save(FormData formData){
        return formRepository.save(formData);
    }

    public FormData getOne(Long formId){
        return formRepository.findById(formId).orElseThrow();
    }

    public Iterable<FormData> findAllForm() {
        return formRepository.findAll();
    }


}
