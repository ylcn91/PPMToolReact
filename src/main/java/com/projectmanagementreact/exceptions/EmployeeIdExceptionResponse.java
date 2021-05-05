package com.projectmanagementreact.exceptions;

public class EmployeeIdExceptionResponse {
    private String erpNo;

    public EmployeeIdExceptionResponse(String erpNo) {
        this.erpNo = erpNo;
    }

    public String getErpNo() {
        return erpNo;
    }

    public void setErpNo(String erpNo) {
        this.erpNo = erpNo;
    }
}
