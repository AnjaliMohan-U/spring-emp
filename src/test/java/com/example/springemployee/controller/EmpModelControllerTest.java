package com.example.springemployee.controller;

import com.example.springemployee.employee.Employee;
import com.example.springemployee.service.EmpModelService;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmpModelControllerTest {
@Mock
EmpModelService empmodelservice;

@InjectMocks
EmpModelController empModelController;

    @Test
   public  void check() {
        List<Employee> emp = new ArrayList<>();
        Employee x = new Employee("e1", "ram", 50000, "I-h", "d1",null);
        emp.add(x);
        System.out.println(emp);
       when(empmodelservice.retrieveByCountry("India")).thenReturn(emp);
       // System.out.println(empmodelservice.retrieveByCountry("India"));
        assertEquals(empModelController.retrieveByCountry("India"), empmodelservice.retrieveByCountry("India"));
        verify(empmodelservice,times(2)).retrieveByCountry("India");

    }
}