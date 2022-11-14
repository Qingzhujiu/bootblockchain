package com.mrli.bootblockchain;

import com.mrli.bootblockchain.common.R;
import com.mrli.bootblockchain.controller.UserController;
import com.mrli.bootblockchain.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootblockchainApplicationTests {

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
        user.setPhoneNumber("1584516481");
        user.setArea("山东");
        user.setRank("警察");
        user.setEducation("研究生");
        user.setProfessionalField("计算机");

        UserController userController = new UserController();
        R<String> stringR = userController.userRegister(user);
        System.out.println(stringR);


    }


}


