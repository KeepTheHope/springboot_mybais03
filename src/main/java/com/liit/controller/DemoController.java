package com.liit.controller;/*
 *created by luoyanrong on 2017/12/24 16:07
 *Email:programmerSuperLuo@163.com
 *
 */

import com.liit.pojo.Demo;
import com.liit.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class DemoController {
    @Resource
    private DemoService demoService;
    @RequestMapping("demo")
    public String index(){
        Demo demo=new Demo();
        demo.setName("我aini");
        demoService.insert(demo);
        int id =demo.getId();
        System.out.print(id);
        return "demo";
    }


    @RequestMapping("/likeName")
    public @ResponseBody List<Demo> likeName(String name){
        return demoService.likeName(name);
        //http://127.0.0.1:8080/likeName?name=我aini
    }

}


