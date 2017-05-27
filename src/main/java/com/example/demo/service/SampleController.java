package com.example.demo.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pomingpo on 2017/5/27.
 */

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/{name}")
    public String indexAction(ModelMap model, @PathVariable("name") String name) {
        model.addAttribute("name", name);
        return "index";
    }
}
