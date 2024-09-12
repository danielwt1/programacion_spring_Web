package com.project.rest.projecto_estudio.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String name;
    private String email;
    private int age;
}
