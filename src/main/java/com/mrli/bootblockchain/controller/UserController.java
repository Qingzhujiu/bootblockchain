package com.mrli.bootblockchain.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mrli.bootblockchain.common.R;
import com.mrli.bootblockchain.common.StatusCode;
import com.mrli.bootblockchain.common.TokenUtil;
import com.mrli.bootblockchain.domain.User;
import com.mrli.bootblockchain.pojo.UserLoginPojo;
import com.mrli.bootblockchain.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    //用户注册
    @PostMapping("/userRegister")
    public @ResponseBody Object userRegister(@RequestBody User user){
        log.info(user.toString());
        int re = userService.saveUser(user);

        if(re > 0){
            return R.success("用户注册成功！", StatusCode.OK);
        }

        return R.error("用户注册失败！",StatusCode.NOTFOUND);
    }

    //用户登录
    @PostMapping("/userLogin")
    public @ResponseBody Object userLogin(@RequestBody UserLoginPojo userLoginPojo){

        log.info(userLoginPojo.getUserName()+"   "+userLoginPojo.getUserPassword());

        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();

        queryWrapper.eq(User::getUserEmail, userLoginPojo.getUserEmail());
        queryWrapper.eq(User::getUserPassword,userLoginPojo.getUserPassword());

        User user = userService.getOne(queryWrapper);

        if (user != null){

            String token = TokenUtil.generateToken(user);
//            解token
//            User user1 = TokenUtil.parseToken(token);

            return R.returnToken(StatusCode.OK,token,user);
        }else{
            return R.error("登录失败！此用户不存在",StatusCode.NOTFOUND);
        }

    }


    @RequestMapping("/test")
    public String test(){
        return "年后";
    }


}
