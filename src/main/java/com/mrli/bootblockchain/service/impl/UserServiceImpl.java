package com.mrli.bootblockchain.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.mrli.bootblockchain.domain.User;
import com.mrli.bootblockchain.service.UserService;
import com.mrli.bootblockchain.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author qingzhujiu
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-11-13 11:59:12
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{
    @Autowired
    private UserMapper userMapper;

    public User getUserByUserName(String username){
        return userMapper.getUserByUserName(username);
    }

}




