package com.dube.employeeinfomavenapp;


import java.util.List;

public class Department  {  

//data members/variables    
private int id;  
private String name;  


//constructor

public Department() {
        super();
}

/*
public Department(int id, String name) {
    this.id = id;
    this.name = name;
}
*/

//setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
//getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    
    
    
}