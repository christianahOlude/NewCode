package org.example.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Contacts {
    private String name;
    private String phoneNumber;
    @ManyToOne
    private User user;
}
