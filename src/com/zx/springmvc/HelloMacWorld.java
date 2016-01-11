package com.zx.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangxin on 16/1/11.
 */
@Controller
public class HelloMacWorld {

    @RequestMapping("hello")
    public String helloworld(){
        System.out.println("Hello Mac World!");
        return "success" ;
    }
}
