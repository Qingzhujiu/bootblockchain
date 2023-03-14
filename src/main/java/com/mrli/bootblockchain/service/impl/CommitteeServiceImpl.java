package com.mrli.bootblockchain.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.mrli.bootblockchain.domain.Committee;
import com.mrli.bootblockchain.mapper.CommitteeMapper;
import com.mrli.bootblockchain.service.CommitteeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author qingzhujiu
* @description 针对表【committee】的数据库操作Service实现
* @createDate 2022-11-21 23:31:47
*/
@Service
public class CommitteeServiceImpl extends ServiceImpl<CommitteeMapper, Committee>
    implements CommitteeService {

    @Autowired
    private CommitteeMapper committeeMapper;

}




