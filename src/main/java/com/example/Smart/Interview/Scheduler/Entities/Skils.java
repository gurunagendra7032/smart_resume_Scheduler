package com.example.Smart.Interview.Scheduler.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Skils {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Skills;
}
