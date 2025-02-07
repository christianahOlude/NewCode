package org.example.data.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String username;
    private String password;
    @OneToMany
    List<Contacts> contactsList =  new ArrayList<>();


}
