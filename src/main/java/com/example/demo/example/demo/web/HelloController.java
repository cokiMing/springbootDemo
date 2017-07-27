package com.example.demo.example.demo.web;

import com.example.demo.example.demo.entity.UserProp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chen on 2017/5/18.
 */
@Controller
public class HelloController {
    @Autowired
    private UserProp userProp;

    @RequestMapping("/")
    public String host(ModelMap map){
        map.addAttribute("host","http://www.baidu.com");
        return "templates/index";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String index(){
        return "Hello World!"+userProp.getUserName();
    }
}
