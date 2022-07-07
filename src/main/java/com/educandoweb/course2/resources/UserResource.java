package com.educandoweb.course2.resources;

import com.educandoweb.course2.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Pedro", "panzagmail.com", "21981025592", "1808");

        return ResponseEntity.ok().body(u);

    }






}
