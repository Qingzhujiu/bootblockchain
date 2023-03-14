package com.mrli.bootblockchain.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mrli.bootblockchain.common.R;
import com.mrli.bootblockchain.domain.Title;
import com.mrli.bootblockchain.domain.User;

/**
* @author qingzhujiu
* @description 针对表【title】的数据库操作Service
* @createDate 2022-11-29 00:56:08
*/
public interface TitleService extends IService<Title> {
    int addTitle(String title, User user,String committeeName);
}
