package com.tiraj.profiles.spring_profiles.dao;

import com.tiraj.profiles.spring_profiles.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRespository extends JpaRepository<Employee,Integer> {
}
