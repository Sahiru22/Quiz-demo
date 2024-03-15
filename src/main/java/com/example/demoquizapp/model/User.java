package com.example.demoquizapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String  submitAnswer;
    private Boolean answerStatus;


    @ManyToOne
    private Question question;
}
