package com.mrli.bootblockchain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mrli.bootblockchain.domain.Conference;
import com.mrli.bootblockchain.mapper.ConferenceMapper;
import com.mrli.bootblockchain.service.ConferenceService;
import org.springframework.stereotype.Service;

/**
* @author qingzhujiu
* @description 针对表【conference】的数据库操作Service实现
* @createDate 2022-11-29 01:11:55
*/
@Service
public class ConferenceServiceImpl extends ServiceImpl<ConferenceMapper, Conference>
    implements ConferenceService {

}




