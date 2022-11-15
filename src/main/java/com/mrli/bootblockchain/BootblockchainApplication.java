package com.mrli.bootblockchain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan("com.mrli.bootblockchain.mapper")
@SpringBootApplication(scanBasePackages = "com.mrli.bootblockchain")
public class BootblockchainApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(BootblockchainApplication.class, args);
        /*
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
                System.out.println(name);
        }
         */
    }

}
