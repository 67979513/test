package com.luculent.net.springboot.web;

import com.luculent.net.springboot.model.Student;
import org.springframework.stereotype.Service;


public interface StudentService {

    Student queryStudentById(Integer id);
}
