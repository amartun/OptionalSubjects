package com.martun.model.service;

import com.martun.model.entity.Student;
import com.martun.model.dao.DaoFactory;
import com.martun.model.dao.StudentDao;
import com.martun.model.entity.Student;

import java.util.List;

public class StudentService {

    DaoFactory daoFactory = DaoFactory.getInstance();

    public List<Student> getAllStudents(){
        try (StudentDao dao = daoFactory.createStudentDao()) {
            return dao.findAll();
        }
    }
}
