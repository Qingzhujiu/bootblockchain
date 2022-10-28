package com.mrli.bootblockchain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mrli.bootblockchain.mapper")
@SpringBootApplication(scanBasePackages = "com.mrli.bootblockchain")
public class BootblockchainApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootblockchainApplication.class, args);
    }

}
