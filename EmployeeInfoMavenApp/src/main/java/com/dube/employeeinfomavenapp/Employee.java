
package com.dube.employeeinfomavenapp;

public class Employee  {  

//data members/variables
private int id;  
private String firstName;
private String lastName;
private Department department;

//constructor
public Employee() {
        super();
    }


//constructor
    public Employee(int id) {
        this.id = id;
    }

//setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    
 //getters

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Department getDepartment() {
        return department;
    }
    

}
