package com.luculent.net.springboot.mapper;

import com.luculent.net.springboot.model.Student;
import com.luculent.net.springboot.web.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;
    /*saaaaaaaaaaaaaaaaaaaaaaaaaaaa*/

    @Override
    public Student queryStudentById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);


        return student;
    }
}
