package com.myCompany.model;


public class User {

    private String firstName;
    private String lastName;
    private String middleName;
    private Integer age;
    private Integer salary;
    private String email;
    private String job;

    public User() {
    }

    public User(String firstName, String lastName,
                String middleName, Integer age,
                Integer salary, String email, String job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.salary = salary;
        this.email = email;
        this.job = job;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    public String getJob() {
        return job;
    }
}
