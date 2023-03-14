package com.mrli.bootblockchain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mrli.bootblockchain.common.R;
import com.mrli.bootblockchain.domain.Title;
import com.mrli.bootblockchain.domain.User;
import com.mrli.bootblockchain.mapper.TitleMapper;
import com.mrli.bootblockchain.service.TitleService;
import org.springframework.stereotype.Service;

/**
* @author qingzhujiu
* @description 针对表【title】的数据库操作Service实现
* @createDate 2022-11-29 00:56:08
*/
@Service
public class TitleServiceImpl extends ServiceImpl<TitleMapper, Title>
    implements TitleService {
    TitleMapper titleMapper;

    public int addTitle(String titleName, User user,String committeeName){
        Title title = new Title();

        title.setCommitteeId(user.getId());
        title.setUserTitle(titleName);
        title.setUserName(user.getName());
        title.setCommitteeName(committeeName);

        return titleMapper.insert(title);

    }


}




