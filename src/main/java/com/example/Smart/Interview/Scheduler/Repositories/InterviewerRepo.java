package com.example.Smart.Interview.Scheduler.Repositories;

import com.example.Smart.Interview.Scheduler.Entities.Interviewer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewerRepo extends JpaRepository<Interviewer,Long > {
}
