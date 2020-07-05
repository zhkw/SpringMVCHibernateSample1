package com.cisdi.enfi.pbs.dao;

import com.cisdi.enfi.pbs.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentDaoJson {
    public List<Student> findAll();
    public List<Map<String,Object>> findAllObject();
}


