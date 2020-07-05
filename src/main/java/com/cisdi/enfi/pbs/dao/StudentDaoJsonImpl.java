package com.cisdi.enfi.pbs.dao;

import com.cisdi.enfi.pbs.entity.Student;
import org.hibernate.*;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository(value = "studentDaoJson")
public class StudentDaoJsonImpl implements StudentDaoJson {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Student> findAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Student> list = new ArrayList<Student>();

        String querySql = "SELECT VP.ID,VP.NAME FROM CUX.CUX_STUDENT vp";
        Query sqlquery = session.createSQLQuery(querySql);
        sqlquery.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
//        sqlquery.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List data = sqlquery.list();

        for(Object object : data){
            Map row = (Map)object;
            int id = Integer.parseInt(((BigDecimal)row.get("ID")).toString());
            String name = (String)row.get("NAME");
            Student student = new Student();
            student.setId(id);
            student.setName(name);
            list.add(student);
        }

        return list;
    }

    @Override
    public List<Map<String,Object>> findAllObject() {
        Session session = sessionFactory.getCurrentSession();

        String querySql = "SELECT VP.ID,VP.NAME FROM CUX.CUX_STUDENT vp";
        Query sqlquery = session.createSQLQuery(querySql);
        sqlquery.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
//        sqlquery.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List<Map<String,Object>> list = sqlquery.list();

        return list;
    }
}
