package com.mrli.bootblockchain.mapper;

import com.mrli.bootblockchain.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author qingzhujiu
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-11-13 11:59:12
* @Entity com.mrli.bootblockchain.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {
    User getUserByUserName(@Param(value = "username") String username);
}




