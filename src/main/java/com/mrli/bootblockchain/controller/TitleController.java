package com.mrli.bootblockchain.controller;



import com.mrli.bootblockchain.service.TitleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/title")
@Slf4j
public class TitleController {
    @Autowired
    TitleService titleService;


}
