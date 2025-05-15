package com.vino.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vino.employee.entity.Employee;
import com.vino.employee.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
  @Autowired 
  private EmployeeRepository repo;

  @PostMapping 
  public Employee add(@RequestBody Employee emp) {
    return repo.save(emp);
  }

  @GetMapping 
  public List<Employee> all() {
    return repo.findAll();
  }
}
