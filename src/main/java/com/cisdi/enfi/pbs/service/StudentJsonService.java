package com.cisdi.enfi.pbs.service;

import com.cisdi.enfi.pbs.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentJsonService {
    public List<Student> getAllStudents();
    public List<Map<String,Object>> getAllObjects();
}
