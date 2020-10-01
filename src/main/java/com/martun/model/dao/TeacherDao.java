package com.martun.model.dao;

import com.martun.model.entity.Teacher;

import java.util.Optional;

public interface TeacherDao extends GenericDao<Teacher> {

    Optional<Teacher> findByName(String name);
}
