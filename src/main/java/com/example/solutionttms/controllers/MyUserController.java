package com.example.solutionttms.controllers;


import com.example.solutionttms.models.MyUser;
import com.example.solutionttms.services.MyUserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class MyUserController {

    private final MyUserService myUserService;

    @Autowired
    public MyUserController(MyUserService myUserService) {
        this.myUserService = myUserService;
    }

    @GetMapping("/")
    ResponseEntity<List<MyUser>> getAllUsers() {
        return ResponseEntity.ok(myUserService.getAllUsers());
    }

    @PostMapping("/create")
    ResponseEntity<MyUser> createUser(@RequestBody MyUser myUser) {
        System.out.println(myUser);
        return ResponseEntity.status(201).body(myUserService.createUser(myUser));
    }


    @DeleteMapping("/{userId}")
    ResponseEntity<String> deleteUser(@PathParam("userId") Long userId){
        myUserService.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }

//    @PostMapping("/addRole/{userId}/{roleId}")
//    ResponseEntity<MyUser> addRole(
//            @PathParam("userId") Long userId,
//            @PathParam("roleId") Long roleId
//    ) {
//
//    }

}
