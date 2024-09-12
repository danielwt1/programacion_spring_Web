package com.project.rest.projecto_estudio.service;

public interface UserService {
    void createUser(String name, String email, int age);
    void updateUser(String name, String email, int age);
    void deleteUser(String name);
    void getUser(String name);
    void getAllUsers();
}
