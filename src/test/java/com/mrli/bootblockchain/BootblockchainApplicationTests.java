package com.mrli.bootblockchain;

import com.mrli.bootblockchain.common.R;
import com.mrli.bootblockchain.controller.UserController;
import com.mrli.bootblockchain.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.servlet.http.HttpServletRequest;

@SpringBootTest
class BootblockchainApplicationTests {
    @Autowired
    private UserController userController;

    @Test
    void contextLoads() {


    }
    @Test
    void TestRegister() {
        User user = new User();
        user.setName("小明");
        user.setUsername("root");
        user.setPassword("123456");
        user.setSex("男");
        user.setAddress("eaxmple@.com");
        user.setMonad("公安局");
        user.setPhone_number("1584516481");
        user.setArea("山东");
        user.setRank("警察");
        user.setEducation("研究生");
        user.setProfessional_field("计算机");


        R<String> stringR = userController.userRegister(user);
        System.out.println(stringR);
    }
    @Test
    void TestLogin() {
        User user = new User();
        user.setUsername("root");
        user.setPassword("123456");
        R<String> stringR = userController.userLogin(null,user);
        System.out.println(stringR);
    }

}


