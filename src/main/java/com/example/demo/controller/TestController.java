package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lifeng
 * @version $Date: 2020/9/15 15:06 $
 */
@RestController
public class TestController {
    @RequestMapping("test")
    public String test() {

        int a=0;
        return "1111122222";
    }

}
