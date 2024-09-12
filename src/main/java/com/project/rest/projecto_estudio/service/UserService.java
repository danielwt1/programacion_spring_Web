package com.project.rest.projecto_estudio.service;

import com.project.rest.projecto_estudio.model.UserEntity;

import java.util.List;

public interface UserService {
    void createUser(String name, String email, int age);
    void updateUser(String name, String email, int age);
    void deleteUser(String name);
    UserEntity getUser(String name);
    List<UserEntity> getAllUsers();
}
