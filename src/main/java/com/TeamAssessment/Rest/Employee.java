package com.TeamAssessment.Rest;


import javax.validation.constraints.Pattern;

public class Employee {

    @Pattern(regexp = "^[a-zA-Z0-9]{4,20}$", message = "Name should be at least 4 characters ")
    private String name;
    @Pattern(regexp = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$", message ="Invalid email" )
    private String email;
    @Pattern(regexp = "^[0-9]{4,}$", message ="Salary should be more than 1000")
    private String salary;

    public Employee(String employeeName, String email, String salary) {
        this.name = employeeName;
        this.email = email;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalary() {
        return salary;

    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
