package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pomingpo on 2017/5/26.
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String home() {
        return "Hello";
    }
}
