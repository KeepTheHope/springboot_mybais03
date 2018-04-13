package com.liit.exception;/*
 *created by luoyanrong on 2017/12/22 20:01
 *Email:programmerSuperLuo@163.com
 *异常类
 */

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobelDefaultException {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String defaultExceptionHandler(HttpServletRequest req,Exception e){
//        ModelAndView model=new ModelAndView();
//        return "model";
        return "服务器繁忙，稍后再试";

    }
}
