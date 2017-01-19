package com.lpxiang.service;

import com.lpxiang.mapper.StudentMapperExtend;
import com.lpxiang.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

/**
 * Created by lipx on 2016/1/26.
 */
public class StudentService {

    @Autowired
    StudentMapperExtend studentMapperExtend;

    public List findAllStudent() {
        return studentMapperExtend.findAllStudents();
    }

    public int insert(Student s) {
        return studentMapperExtend.insert(s);
    }

    public int deleteById(Integer id) {
        return studentMapperExtend.deleteById(id);
    }
}
