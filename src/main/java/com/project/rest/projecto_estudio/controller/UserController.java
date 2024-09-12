package com.project.rest.projecto_estudio.controller;

import com.project.rest.projecto_estudio.controller.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody UserDto userDto) {


        return ResponseEntity.ok("User created");
    }
    @GetMapping
    public ResponseEntity<String> getUser() {
        return ResponseEntity.ok("User retrieved");
    }
    @GetMapping("/all")
    public ResponseEntity<String> getAllUsers() {
        return ResponseEntity.ok("All users retrieved");
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        return ResponseEntity.ok("User deleted");
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody UserDto userDto) {
        return ResponseEntity.ok("User updated");
    }


}
