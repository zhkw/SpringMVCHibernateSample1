package com.cisdi.enfi.pbs.dao;

import com.cisdi.enfi.pbs.entity.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "studentDaoTemplate")
public class StudentDaoTemplateImpl {
    @Autowired
    private SessionFactory sessionFactory;

    private HibernateTemplate ht=null;

    private HibernateTemplate getHibernateTemplate(){
        if(ht == null){
            ht = new HibernateTemplate((sessionFactory));
        }
        return ht;
    }

    public List<Student> findAllStudent(){
        return getHibernateTemplate().find("from Student c");
    }

}
