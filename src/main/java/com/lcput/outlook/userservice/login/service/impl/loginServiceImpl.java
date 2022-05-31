package com.lcput.outlook.userservice.login.service.impl;

import cn.hutool.jwt.JWT;
import com.lcput.outlook.userservice.login.service.loginService;
import com.lcput.outlook.userservice.util.DataResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class loginServiceImpl implements loginService{

    @Override
    public DataResult getToken() {
        JWT j = JWT.create();
        String algorithm = j.getAlgorithm();
        log.info(algorithm);
        return DataResult.success(algorithm);
    }
}
