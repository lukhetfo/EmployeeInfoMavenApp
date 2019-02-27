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

/**
 *
 * @author Enock Lukhetfo Dube <lukhetfomzomba@gmail.com>
 */
public class DepartmentTest {
    
    public DepartmentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setId method, of class Department.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 101010;
        Department instance = new Department();
        instance.setId(id);
        assertEquals(id, instance.getId() );
    }

    /**
     * Test of setName method, of class Department.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Department instance = new Department();
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    
    
}
