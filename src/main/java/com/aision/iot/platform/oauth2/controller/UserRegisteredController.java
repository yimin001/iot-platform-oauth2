package com.aision.iot.platform.oauth2.controller;

import com.aision.iot.platform.oauth2.entity.UserEntity;
import com.aision.iot.platform.oauth2.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author yim
 * @description 用户注册信息
 * @date 2019/5/7
 */
@Api(tags = "用户注册相关")
@RestController
@RequestMapping("/userRegistered")
public class UserRegisteredController {

    private static Logger logger = LoggerFactory.getLogger(UserRegisteredController.class);

    @Autowired
    private UserService userService;

    @ApiOperation(value = "注册接口")
    @PostMapping("/registered")
    public ResponseEntity<String> registered(@Valid @RequestBody UserEntity entity){
        logger.info("registered info :{}", entity);
        if (userService.registered(entity)){
            return ResponseEntity.ok("ok");
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("login name is repeat");
        }
    }

    @ApiOperation(value = "注册名是否重复")
    @GetMapping("/isLoginNameRepeat")
    public ResponseEntity<String> isLoginNameRepeat(@ApiParam("注册名") String loginName){
        logger.info("loginName info :{}", loginName);
        if (userService.isLoginNameRepeat(loginName)){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("login name is repeat");
        }else {
            return ResponseEntity.ok("ok");
        }
    }

}
