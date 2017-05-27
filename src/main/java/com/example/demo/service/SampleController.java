package com.example.demo.service;

import com.google.common.collect.Lists;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by pomingpo on 2017/5/27.
 */

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/{name}")
    public String indexAction(ModelMap model, @PathVariable("name") String name) {
        List<String> list = Lists.newArrayList("Jan", "Peter", "Jane");
        model.addAttribute("letterlist", list);
        return "index";
    }
}
