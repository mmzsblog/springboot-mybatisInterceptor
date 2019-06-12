package com.java.mmzsit.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：liuhongjiang
 * @description：TODO
 * @date ：2019/6/10 15:04
 */
@RestController
@RequestMapping()
@Slf4j(topic = "【TableController】Mybatis拦截器对数据库水平分表控制类")
@SuppressWarnings({"unchecked", "rawtypes"})
public class TableController {
    @PostMapping("/add")
    public String uploadTripScan(@RequestBody String reqdata) {

        return null;
    }
}
