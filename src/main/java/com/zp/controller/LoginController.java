package com.zp.controller;

import com.zp.domain.ResponseResult;
import com.zp.entity.User;
import com.zp.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: GNEPgnahZ
 */
@RestController
@Slf4j
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/user/login")
    public ResponseResult login(@RequestBody User user){
        return loginService.login(user);
    }

    @PostMapping("/user/logout")
    public ResponseResult logout(){
        return loginService.logout();

    }
}
