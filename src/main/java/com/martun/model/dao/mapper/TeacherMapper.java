package com.martun.model.dao.mapper;

import com.martun.model.entity.Teacher;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class TeacherMapper implements ObjectMapper<Teacher> {

    @Override
    public Teacher extractFromResultSet(ResultSet rs) throws SQLException {
        Teacher teacher = new Teacher();
        teacher.setId(rs.getInt("idteacher"));
        teacher.setName(rs.getString("teacher.name"));
        teacher.setCourse(rs.getString("course"));
        teacher.setRoom(rs.getInt("room"));
        teacher.setPassHash(rs.getInt("pass_hash"));
        return teacher;
    }

    public Teacher makeUnique(Map<Integer, Teacher> cache,
                              Teacher teacher) {
        cache.putIfAbsent(teacher.getId(), teacher);
        return cache.get(teacher.getId());
    }
}
