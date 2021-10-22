package com.example.springemployee.service;

import com.example.springemployee.employee.Department;
import com.example.springemployee.employee.Employee;
import com.example.springemployee.employee.Location;
import com.example.springemployee.hardcode.EmployeeInitService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpModelService {
    EmployeeInitService initservice = new EmployeeInitService();
    List<Employee> employees = initservice.getAllEmployees();

   public List<Employee> getEmployeeList(){
        return initservice.getAllEmployees();
   }

    public List<Employee> retrieveByCountry(String country) {
        String i = Character.toString(country.charAt(0));
        return employees.stream().filter(emp -> emp.getLoc_id().startsWith(i)).collect(Collectors.toList());
    }

}
