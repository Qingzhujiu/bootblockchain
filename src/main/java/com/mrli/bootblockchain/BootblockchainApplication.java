package com.mrli.bootblockchain;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@MapperScan("com.mrli.bootblockchain.mapper")
@SpringBootApplication(scanBasePackages = "com.mrli.bootblockchain")
@EnableTransactionManagement
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
