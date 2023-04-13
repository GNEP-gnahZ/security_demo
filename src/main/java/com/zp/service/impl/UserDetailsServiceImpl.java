package com.zp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zp.entity.LoginUser;
import com.zp.entity.User;
import com.zp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @Description:
 * @Author: GNEPgnahZ
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //（认证，即校验该用户是否存在）查询用户信息
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUserName,username);
        User user = userMapper.selectOne(queryWrapper);
        //如果没有查询到用户
        if (Objects.isNull(user)){
            throw new RuntimeException("用户名或者密码错误");
        }


        //TODO (授权，即查询用户具有哪些权限)查询对应的用户信息
        //定义一个权限集合
        List<String> list = new ArrayList<String>(Arrays.asList("test","admin"));

        //把数据封装成UserDetails返回
        return new LoginUser(user,list);
    }
}
