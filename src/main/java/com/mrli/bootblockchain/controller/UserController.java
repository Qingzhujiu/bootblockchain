package com.mrli.bootblockchain.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mrli.bootblockchain.common.R;
import com.mrli.bootblockchain.common.RForLoginAndRegister;
import com.mrli.bootblockchain.domain.User;
import com.mrli.bootblockchain.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController(value = "/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;


    /**
     * 用户登录功能，将对传入的用户密码进行md5加密
     * 通过用户名在数据库进行查找，若存则返回该用户的信息，并与传入的加密后的密码进行校验
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/login")
    public R<String> userLogin(HttpServletRequest request,@RequestBody User user){
        String password = user.getPassword();
        String username = user.getUsername();
        //1.将密码进行md5加密
        password = DigestUtils.md5DigestAsHex(password.getBytes());

        //2.根据页面提交的用户名username查询数据库
        User serviceOne = userService.getUserByUserName(username);

        String token =null;

        //3.如果没有查询到该用户名则登陆失败
        if (serviceOne == null){
            return RForLoginAndRegister.error("登入失败或token过期，请联系后台人员进行修改",404,token);
        }else {
            //4.密码比对，如果不一致则返回登录失败
            if (!password.equals(serviceOne.getPassword())){
                return RForLoginAndRegister.error("登入失败或token过期，请联系后台人员进行修改",404,token);
            }

            //6.登录成功,将员工id存入Session并返回登录成功结果
            request.getSession().setAttribute("user",serviceOne.getId());

            return RForLoginAndRegister.success("登入成功",200,token);
        }

    }

    /**
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/register")
    public R<String> userRegister(@RequestBody User user){
        //将用户输入的密码进行md5加密
        String password = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        user.setPassword(password);

        boolean save = userService.save(user);
        if (save){
            return RForLoginAndRegister.success("注册成功",200,null);
        }else {
            return RForLoginAndRegister.error("注册失败请重新注册",404,null);
        }
    }

}