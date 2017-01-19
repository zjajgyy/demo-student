package com.lpxiang.controller;

import com.lpxiang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Tracy on 2016/3/12.
 */
@RestController
@RequestMapping( value = "/student", produces = "application/json;charset=UTF-8")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping( value = "/getall")
    public String index() {
        return studentService.findAllStudent().get(0).toString();
    }

}
