package org.example.services;

import org.example.Dto.CreateNewUser;
import org.example.Dto.CreateNewUserResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.example.Exception.UserAlreadyExistException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void testThatUserCanBeCreated(){
    CreateNewUser newUser = new CreateNewUser();
    newUser.setUsername("tbelz");
    newUser.setPassword("badPassword");

    CreateNewUserResponse newUserResponse = userService.createUser(newUser);
    assertNotNull(newUserResponse);

    }

    @Test
    public void testThatUserCannotHaveSameUsername(){
        CreateNewUser newUser = new CreateNewUser();
        newUser.setUsername("tbelz");
        newUser.setPassword("badPassword");


        assertThrows(UserAlreadyExistException.class, ()-> userService.createUser(newUser));
    }


}
