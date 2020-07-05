package com.cisdi.enfi.pbs.controller;

import com.cisdi.enfi.pbs.dao.StudentDaoJsonImpl;
import com.cisdi.enfi.pbs.service.StudentJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class OracleJsonController {

    @Autowired
    private StudentJsonService studentJsonService;

    @RequestMapping("/mainoracle3")
    public String findJsonData(ModelMap map){
        map.addAttribute("todos",studentJsonService.getAllStudents());
        //List<Map<String, Object>> list = studentDaoJson.findJson();
        return "mainoracle";
    }

    @RequestMapping("/mainoracle33")
    @ResponseBody
    public List<Map<String,Object>> findJsonObject(ModelMap map){
        List<Map<String,Object>> list = studentJsonService.getAllObjects();
        return list;
    }
}
