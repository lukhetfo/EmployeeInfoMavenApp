/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dube.employeeinfomavenapp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setId method, of class Employee.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 555;
        Employee instance = new Employee();
        instance.setId(id);
        assertEquals(id, instance.getId());
        
    }

    /**
     * Test of setFirstName method, of class Employee.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Employee instance = new Employee();
        instance.setFirstName(firstName);
        assertEquals(firstName, instance.getFirstName());
    }

    /**
     * Test of setLastName method, of class Employee.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Employee instance = new Employee();
        instance.setLastName(lastName);
        assertEquals(lastName, instance.getLastName());
    }

    /**
     * Test of setDepartment method, of class Employee.
     */
    @Test
    public void testSetDepartment() {
        System.out.println("setDepartment");
         
         //hard dependency to be avoided in unit test
         /*
            Department department = new Department();
            Employee instance = new Employee();
            instance.setDepartment(department);
         */
        
        /* create mock object instead -- preferred way
        Reason :- A unit test should test functionality in 
        isolation. Side effects from other classes or the 
        system should be eliminated for a unit test, if 
        possible.
        */
       Department departmentMock = mock(Department.class);
        
        // mock the behavior of department object
       when(departmentMock.getId()).thenReturn(444);
       when(departmentMock.getName()).thenReturn("Mathematics");
        
        //init variables
        Employee instance = new Employee();
        instance.setDepartment(departmentMock);
        assertEquals(444, instance.getDepartment().getId());
        assertEquals("Mathematics", instance.getDepartment().getName());
        
    }
    
}
