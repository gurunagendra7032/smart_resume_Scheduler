package com.example.Smart.Interview.Scheduler.Repositories;

import com.example.Smart.Interview.Scheduler.Entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {
}
