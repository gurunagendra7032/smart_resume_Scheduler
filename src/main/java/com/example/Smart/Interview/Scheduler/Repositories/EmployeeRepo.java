package com.example.Smart.Interview.Scheduler.Repositories;

import com.example.Smart.Interview.Scheduler.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
