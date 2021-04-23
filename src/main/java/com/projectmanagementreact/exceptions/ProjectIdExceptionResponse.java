package com.projectmanagementreact.exceptions;

public class ProjectIdExceptionResponse {

    private String projetIdentifier;

    public ProjectIdExceptionResponse(String projetIdentifier) {
        this.projetIdentifier = projetIdentifier;
    }

    public void setProjetIdentifier(String projetIdentifier) {
        this.projetIdentifier = projetIdentifier;
    }

    public String getProjetIdentifier() {
        return projetIdentifier;
    }
}
