package com.newer.controller;

import com.newer.bean.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/emp")
public class EmpContoller {

    @RequestMapping("/add")
    public String addEmp(@Valid Emp emp, BindingResult bindingResult){
        //Valid注解执行emp实例的数据校验
        if(bindingResult.hasErrors()){
            return "emp";
        }else {
            return "show";
        }
    }
}
