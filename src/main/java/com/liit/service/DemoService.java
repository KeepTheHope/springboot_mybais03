package com.liit.service;/*
 *created by luoyanrong on 2017/12/24 16:01
 *Email:programmerSuperLuo@163.com
 *
 */

import com.liit.mapping.DemoMapper;
import com.liit.pojo.Demo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;

    public List<Demo> likeName(String name){
        return demoMapper.likeName(name);
    }
    public void insert(Demo demo){
        demoMapper.insert(demo);
    }
}

