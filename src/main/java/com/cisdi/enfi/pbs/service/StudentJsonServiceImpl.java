package com.cisdi.enfi.pbs.service;

import com.cisdi.enfi.pbs.dao.StudentDaoJson;
import com.cisdi.enfi.pbs.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("studentJsonService")
public class StudentJsonServiceImpl implements StudentJsonService {
    @Autowired
    private StudentDaoJson studentDaoJson;

    @Override
    @Transactional
    public List<Student> getAllStudents() {
        return studentDaoJson.findAll();
    }

    @Override
    @Transactional
    public List<Map<String,Object>> getAllObjects() {
        return studentDaoJson.findAllObject();
    }
}
