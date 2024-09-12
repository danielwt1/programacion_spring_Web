package com.project.rest.projecto_estudio.service.impl;

import com.project.rest.projecto_estudio.config.BeansConfig;
import com.project.rest.projecto_estudio.model.UserEntity;
import com.project.rest.projecto_estudio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void createUser(String name, String email, int age) {
        UserEntity user  = new UserEntity(name, email, age);
        BeansConfig.USER_LIST.add(user);
    }

    @Override
    public void updateUser(String name, String email, int age) {
        int index = -1;
        for (int i = 0; i < BeansConfig.USER_LIST.size(); i++) {
            if (BeansConfig.USER_LIST.get(i).getName().equals(name)) {
                index = i;
                UserEntity newUser = new UserEntity(name, email, age);
                BeansConfig.USER_LIST.set(index, newUser);
                break;
            }
        }

        if (index == -1) {
            System.out.println("Usuario no encontrado");

        }

    }

    @Override
    public void deleteUser(String name) {
int index = -1;
        for (int i = 0; i < BeansConfig.USER_LIST.size(); i++) {
            if (BeansConfig.USER_LIST.get(i).getName().equals(name)) {
                index = i;
                BeansConfig.USER_LIST.remove(index);

                break;
            }
        }

        if (index == -1) {
            System.out.println("Usuario no encontrado");

        }

    }

    @Override
    public UserEntity getUser(String name) {
        int index = -1;
        for (int i = 0; i < BeansConfig.USER_LIST.size(); i++) {
            if (BeansConfig.USER_LIST.get(i).getName().equals(name)) {
                index = i;
                return BeansConfig.USER_LIST.get(index);
            }
        }
        return null;

    }

    @Override
    public List<UserEntity> getAllUsers() {
        return BeansConfig.USER_LIST;
    }
}
