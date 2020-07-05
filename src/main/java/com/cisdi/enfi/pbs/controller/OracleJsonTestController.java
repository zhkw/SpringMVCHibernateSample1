package com.cisdi.enfi.pbs.controller;

import com.cisdi.enfi.pbs.dao.StudentDaoTestImpl;
import com.cisdi.enfi.pbs.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class OracleJsonTestController {

    @Autowired
    private StudentDaoTestImpl studentDaoTest;

    @RequestMapping("/testjson")
    @ResponseBody
    public String findJsonData(ModelMap map){
        return "testjson2";
    }

    @RequestMapping("/testjson2")
    @ResponseBody
    public List<Student> findJsonData2(ModelMap map){
        Student s1=new Student();
        s1.setId(1);
        s1.setName("zkw");
        Student s2=new Student();
        s2.setId(2);
        s2.setName("aaa");
        List<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        return list;
    }
}
