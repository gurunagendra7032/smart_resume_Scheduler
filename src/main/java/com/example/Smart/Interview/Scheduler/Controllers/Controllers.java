package com.example.Smart.Interview.Scheduler.Controllers;


import com.example.Smart.Interview.Scheduler.Entities.EmployeeDetails;
import com.example.Smart.Interview.Scheduler.Repositories.EmployeeDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controllers {

    @Autowired
    private EmployeeDetailsRepo employeeDetailsRepo;

    @PostMapping("/employee/details")
    public EmployeeDetails addDetails(@RequestBody EmployeeDetails employeeDetails){
        return employeeDetailsRepo.save(employeeDetails);
    }

    @GetMapping("/employees")
    public List<EmployeeDetails> getDetails(){
        return employeeDetailsRepo.findAll();
    }
}
