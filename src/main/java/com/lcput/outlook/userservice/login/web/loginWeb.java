package com.lcput.outlook.userservice.login.web;

import com.lcput.outlook.userservice.login.service.loginService;
import com.lcput.outlook.userservice.util.DataResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user/login")
@ControllerAdvice
public class loginWeb {

    private loginService loginService;


    public loginWeb(loginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/getToken")
    public DataResult getToken() {
        return null;
    }
}
