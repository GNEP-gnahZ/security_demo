package com.zp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zp.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: GNEPgnahZ
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

}
