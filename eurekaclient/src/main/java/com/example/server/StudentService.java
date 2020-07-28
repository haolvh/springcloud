package com.example.server;

import com.example.entity.Student;

import java.util.Collection;

/**
 * @author LvHao
 * @Description :
 * @date 2020-07-28 10:38
 */
public interface StudentService {
    public Collection<Student> findAll();

    public Student findById(long id);

    public void saveOrUpdate(Student student);

    public void deleteById(long id);
}
