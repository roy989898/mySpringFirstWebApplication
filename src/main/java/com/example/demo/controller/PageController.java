package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pomingpo on 2017/5/26.
 */
@RestController
public class PageController {

    @RequestMapping("/")
    public String home() {
        return "Hello";
    }
}
