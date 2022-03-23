package com.luculent.net.springboot.web;

import com.luculent.net.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/userById")
    @ResponseBody
    
    public Student selectuserById(Integer id){
        Student student=studentService.queryStudentById(id);

        return student;
    }
}
