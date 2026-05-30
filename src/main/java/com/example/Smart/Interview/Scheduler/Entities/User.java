package com.example.Smart.Interview.Scheduler.Entities;

import com.example.Smart.Interview.Scheduler.Role;
import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String Username;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;

}
