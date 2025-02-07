package org.example.data.models;

import jakarta.persistence.*;

@Entity
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phoneNumber;
    @ManyToOne
    private User user;
}
