package com.tiraj.profiles.spring_profiles.service;

import com.tiraj.profiles.spring_profiles.dao.EmployeeRespository;
import com.tiraj.profiles.spring_profiles.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile(value = {"local","dev"})
public class EmployeeService {

    @Autowired
    private EmployeeRespository respository;


    public List<Employee> getEmployees(){
        return respository.findAll();
    }



}
