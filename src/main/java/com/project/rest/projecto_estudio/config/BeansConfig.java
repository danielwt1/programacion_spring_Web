package com.project.rest.projecto_estudio.config;

import com.project.rest.projecto_estudio.model.UserEntity;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfig {
    public static final List<UserEntity> USER_LIST = new ArrayList<>();

}
