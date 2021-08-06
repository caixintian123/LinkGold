package com.linkgold.base.modules.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private AuthenticationManager manager;

    public String login(@RequestBody Object ob){
        Authentication token = new UsernamePasswordAuthenticationToken("username", "password");
        Authentication authenticate = manager.authenticate(token);
        SecurityContextHolder.getContext().setAuthentication(authenticate);
        return "success";
    }


}
