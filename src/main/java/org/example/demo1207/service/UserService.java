package org.example.demo1207.service;

import org.example.demo1207.dto.UserDto;
import org.example.demo1207.model.User;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface UserService {

    Optional<User> createUser(User user);

    List<UserDto> readAllUsers();

    Optional<User> readUserById(String id);

    Optional<User> updateUserById(String id, User newUserData) throws IllegalAccessException;

    boolean deleteUserById(String id);

    Map<String, Object> getUsersPage(String firstName, String lastName, String email, Pageable pageable);

    boolean saveLog(ChangeService changeService, User oldUser, User newUser) throws IllegalAccessException;
}
