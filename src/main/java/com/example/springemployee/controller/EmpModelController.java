package com.example.springemployee.controller;

import com.example.springemployee.employee.Employee;
import com.example.springemployee.service.EmpModelService;
import com.example.springemployee.employee.Employee;
import com.example.springemployee.service.EmpModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EmpModelController {

    @Autowired
    private EmpModelService empmodelservice;

    @GetMapping("/getAllEmployee")
    List<Employee> getAll(){
        return empmodelservice.getEmployeeList();
    }

    @GetMapping("/retrieve-by-country/{country}")
    List<Employee> retrieveByCountry(@PathVariable String country){
        return empmodelservice.retrieveByCountry(country);
    }



}
