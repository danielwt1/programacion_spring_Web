package com.project.rest.projecto_estudio.controller;

import com.project.rest.projecto_estudio.controller.dto.UserDto;
import com.project.rest.projecto_estudio.model.UserEntity;
import com.project.rest.projecto_estudio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody UserDto userDto) {
        userService.createUser(userDto.getName(), userDto.getEmail(), userDto.getAge());
        return new ResponseEntity<>("User created", HttpStatus.CREATED);
    }
    @GetMapping("/{name}")
    public ResponseEntity<UserEntity> getUser(@PathVariable String name) {
        UserEntity user = userService.getUser(name);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<UserEntity>> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
    }
    @DeleteMapping("/delete/{name}")
    public ResponseEntity<String> deleteUser(@PathVariable String name) {
        userService.deleteUser(name);
        return ResponseEntity.ok("User deleted");
    }
    @PutMapping("/update/{name}")
    public ResponseEntity<Void> updateUser(@PathVariable String name, @RequestBody UserDto userDto) {
        userService.updateUser(userDto.getName(), userDto.getEmail(), userDto.getAge());
        return  new ResponseEntity<>(HttpStatus.OK);
    }


}
