package com.mrli.bootblockchain.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mrli.bootblockchain.common.R;
import com.mrli.bootblockchain.domain.Committee;
import com.mrli.bootblockchain.service.CommitteeService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/committee")
@Slf4j
public class CommitteeController {
    @Autowired
    private CommitteeService committeeService;

    @RequestMapping(value = "/create")
    public R<String> createCommittee(HttpServletRequest request, @RequestBody Committee committee, @RequestPart(value = "logo")MultipartFile logomMultipartFile){
        //获取登录的用户的id值，在登录时已存入session中
        Long userid = (Long) request.getSession().getAttribute("user");

        //创建委员会时，默认状态为0  表示等待管理员确认
        committee.setState(0);


        //新创建委员会的主席默认为登录用户
        committee.setPresidentId(userid);

        //待办，处理用户上传的logo信息
        try {
            committee.setLogo(logomMultipartFile.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        boolean save = committeeService.save(committee);
        if (save){
            return R.success("创建委员会成功，请等待管理员确认!",1);
        }else {
            return R.error("创建委员会失败，请重试!",0);
        }

    }

    /**
     * 查询已经创建成功的委员会
     * @return
     */
    @RequestMapping(value = "searchall")
    public R<List<Committee>>searchAllCommittee(){

        QueryWrapper<Committee> QueryWrapper = new QueryWrapper<>();
        QueryWrapper.eq("state","1");

        List<Committee> list = committeeService.list(QueryWrapper);
        if (list == null || list.size() == 0){
            return R.error("查询错误",0);
        }
        return R.success(list,1);
    }



}
