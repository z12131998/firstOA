package com.first.service.user.impl;


import com.first.common.restful.RestResult;
import com.first.service.user.UserService;
import org.springframework.stereotype.Service;

/**
 * @author 周俊宇
 * @version 1.0.0
 * @title UserServiceImple
 * @description 用户业务实现类
 * @date 2024/4/8 16:26
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    public RestResult success() {
        return RestResult.success();
    }

}