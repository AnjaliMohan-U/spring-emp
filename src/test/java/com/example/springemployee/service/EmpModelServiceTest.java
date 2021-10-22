package com.example.springemployee.service;


import com.example.springemployee.employee.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class EmpModelServiceTest {
    @InjectMocks
    private EmpModelService empservicemodel;

    @Test
    public void getAllEmployees(){
        List<Employee> allEmployees = empservicemodel.getEmployeeList();
        assertEquals(7,allEmployees.size());
        assertEquals("ram", allEmployees.get(0).getEmp_name());
    }

    @Test
    public void getEmployeeByCountry(){
        List<Employee> employeeByCountry = empservicemodel.retrieveByCountry("India");
        assertEquals(4,employeeByCountry.size());
    }
}
