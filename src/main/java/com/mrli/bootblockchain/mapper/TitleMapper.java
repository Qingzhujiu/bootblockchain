package com.mrli.bootblockchain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mrli.bootblockchain.domain.Title;
import org.apache.ibatis.annotations.Mapper;

/**
* @author qingzhujiu
* @description 针对表【title】的数据库操作Mapper
* @createDate 2022-11-29 00:56:08
* @Entity bootblockchain.domain.Title
*/
@Mapper
public interface TitleMapper extends BaseMapper<Title> {

}




