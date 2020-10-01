package com.martun.model.service;

import com.martun.model.entity.Teacher;
import com.martun.model.dao.DaoFactory;
import com.martun.model.dao.TeacherDao;
import com.martun.model.entity.Teacher;

import java.util.Optional;

public class TeacherService {

    DaoFactory daoFactory = DaoFactory.getInstance();
    public Optional<Teacher> login(String name){
        Optional<Teacher> result; //= Optional.empty();
        try(TeacherDao teacherDao = daoFactory.createTeacherDao()){
            result = teacherDao.findByName(name);
        }
        return result;
    }
}
