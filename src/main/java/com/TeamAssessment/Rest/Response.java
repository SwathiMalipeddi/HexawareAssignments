package com.TeamAssessment.Rest;
import java.util.ArrayList;
import java.util.List;


public class Response {

    private String status;
    private List<String> errors = new ArrayList<>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
