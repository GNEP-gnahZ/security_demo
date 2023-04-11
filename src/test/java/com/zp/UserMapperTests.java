package com.zp;

import com.zp.entity.User;
import com.zp.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Description:
 * @Author: GNEPgnahZ
 */
@SpringBootTest
public class UserMapperTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserMapper(){
        List<User> list = userMapper.selectList(null);
        for (User user :list){
            System.out.println(user);
        }
    }
}
