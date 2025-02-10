package org.example.Dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CreateNewUser {

    private String username;
    private String password;

}
