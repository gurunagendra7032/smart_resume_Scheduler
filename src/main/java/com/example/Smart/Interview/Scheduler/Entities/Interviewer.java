package com.example.Smart.Interview.Scheduler.Entities;

import jakarta.persistence.*;

@Entity
public class Interviewer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String EmployeeId;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @ManyToOne
    private Department department;

    @OneToOne
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
