package org.example.services;

import org.example.Dto.CreateNewUser;
import org.example.Dto.CreateNewUserResponse;

public interface UserService {
    CreateNewUserResponse createUser(CreateNewUser newUser);

}
