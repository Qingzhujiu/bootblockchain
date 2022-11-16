package com.mrli.bootblockchain.service;

import com.mrli.bootblockchain.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
* @author qingzhujiu
* @description 针对表【user】的数据库操作Service
* @createDate 2022-11-13 11:59:12
*/

public interface UserService extends IService<User> {
    User getUserByUserName(String username);

}
