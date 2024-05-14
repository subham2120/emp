package com.emp.demo.emp;

import jakarta.persistence.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="Ems")
public class EmpEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String email;
    private long phno;
    private String salary;

    public EmpEntity(){
        super();
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    
    public long getPhno(){
        return phno;
    }
   public void setPhno(long phno){
        this.phno=phno;
    }

      public String getSalary(){
        return salary;
    }
    public void setSalary(String salary){
        this.salary=salary;
    }

    @Override
    public String toString(){
        return "EmpEntity[id="+id+",name="+name+",address="+address+",email="+email+",phone="+phno+",salary="+salary+"]";
    }
    
}
