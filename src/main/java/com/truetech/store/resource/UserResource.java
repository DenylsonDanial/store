package com.truetech.store.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truetech.store.entity.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User (1L,"Maria","maria@gmail.com","84123","0000");
        return ResponseEntity.ok().body(u);
    }
}
