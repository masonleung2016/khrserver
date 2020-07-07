package com.ufostudio.khr.controller;

import com.ufostudio.khr.model.Hr;
import com.ufostudio.khr.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: LCF
 * @Date: 2020/7/7 10:26
 * @Package: com.ufostudio.khr.controller
 */

@RestController
@RequestMapping("/chat")
public class ChatController {
    @Autowired
    HrService hrService;
    @GetMapping("/hrs")
    public List<Hr> getAllHrs() {
        return hrService.getAllHrsExceptCurrentHr();
    }
}
