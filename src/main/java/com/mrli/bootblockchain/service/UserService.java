package com.mrli.bootblockchain.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mrli.bootblockchain.domain.User;

/**
* @author 时之始
* @description 针对表【user】的数据库操作Service
* @createDate 2022-10-27 20:58:24
*/
public interface UserService extends IService<User> {

    public int saveUser(User user);

}
