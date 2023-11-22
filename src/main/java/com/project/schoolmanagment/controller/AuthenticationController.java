package com.project.schoolmanagment.controller;

import com.project.schoolmanagment.payload.AuthResponse;
import com.project.schoolmanagment.payload.request.LoginRequest;
import com.project.schoolmanagment.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController { //  Authentication - WHO ARE U? **********  Authorization  - WHAT CAN YOU DO WİTH THİS APPLICATİON?


    private final AuthenticationService authenticationService;

    //NOT: Login() **********************************
    @PostMapping("/login") //http://localhost:8091/authh/login + POST +JSON
    public ResponseEntity<AuthResponse> authenticateUser(@RequestBody @Valid LoginRequest loginRequest){
        return authenticationService.authenticateUser(loginRequest);

        //NOT: findByUsername()*********************************





        //NOT: updatePassword()*********************************


    }
}
