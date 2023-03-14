package com.mrli.bootblockchain.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mrli.bootblockchain.domain.Committee;
import org.apache.ibatis.annotations.Mapper;


/**
* @author qingzhujiu
* @description 针对表【committee】的数据库操作Mapper
* @createDate 2022-11-21 23:31:47
* @Entity bootblockchain.domain.Committee
*/
@Mapper
public interface CommitteeMapper extends BaseMapper<Committee> {

}




