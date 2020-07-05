package com.cisdi.enfi.pbs.controller;

import com.cisdi.enfi.pbs.dao.StudentDaoTemplateImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OracleTemplateController {
    @Autowired
    private StudentDaoTemplateImpl studentDaoTemplate;

    @RequestMapping("/mainoracle2")
    public String ListStudents(ModelMap map){
        map.addAttribute("todos",studentDaoTemplate.findAllStudent());
        return "mainoracle";
    }
}
