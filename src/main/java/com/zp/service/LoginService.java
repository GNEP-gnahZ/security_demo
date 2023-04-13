package com.zp.service;

import com.zp.domain.ResponseResult;
import com.zp.entity.User;

/**
 * @Description:
 * @Author: GNEPgnahZ
 */

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
