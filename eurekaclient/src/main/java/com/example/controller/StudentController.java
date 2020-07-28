package com.example.controller;

import com.example.entity.Student;
import com.example.server.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author LvHao
 * @Description :
 * @date 2020-07-28 10:49
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentService.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentService.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentService.saveOrUpdate(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        studentService.deleteById(id);
    }
}
