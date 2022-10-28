package com.mrli.bootblockchain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mrli.bootblockchain.domain.User;
import com.mrli.bootblockchain.service.UserService;
import com.mrli.bootblockchain.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
* @author 时之始
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-10-27 20:58:24
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public int saveUser(User user) {
        user.setUserCreateDate(new Date());

        return userMapper.insert(user);
    }



}
