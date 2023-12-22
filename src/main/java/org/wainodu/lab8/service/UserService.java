package org.wainodu.lab8.service;

import org.wainodu.lab8.dto.UserDto;
import org.wainodu.lab8.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
