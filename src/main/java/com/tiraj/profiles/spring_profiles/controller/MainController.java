package com.tiraj.profiles.spring_profiles.controller;

import com.tiraj.profiles.spring_profiles.model.Employee;
import com.tiraj.profiles.spring_profiles.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/get")
    public List<Employee> getAll(){
        return service.getEmployees();
    }


}
