package com.project.rest.projecto_estudio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    private String name;
    private String email;
    private int age;
}
