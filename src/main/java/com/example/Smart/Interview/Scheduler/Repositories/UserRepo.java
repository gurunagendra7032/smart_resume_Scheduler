package com.example.Smart.Interview.Scheduler.Repositories;

import com.example.Smart.Interview.Scheduler.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
