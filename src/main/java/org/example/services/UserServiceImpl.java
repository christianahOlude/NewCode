package org.example.services;

import org.example.Dto.CreateNewUser;
import org.example.Dto.CreateNewUserResponse;
import org.example.Exception.UserAlreadyExistException;
import org.example.data.models.User;
import org.example.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;



    @Override
    public CreateNewUserResponse createUser(CreateNewUser newUser) {

        if (userRepository.existsByUsername(newUser.getUsername())) {
            throw new UserAlreadyExistException("user with username" + newUser.getUsername());
        }
        User user = new User();
        user.setUsername(newUser.getUsername());
        user.setPassword(newUser.getPassword());
        userRepository.save(user);

        CreateNewUserResponse createNewUserResponse = new CreateNewUserResponse();
        createNewUserResponse.setMessage("user created successfully");
        return createNewUserResponse;

    }
}
