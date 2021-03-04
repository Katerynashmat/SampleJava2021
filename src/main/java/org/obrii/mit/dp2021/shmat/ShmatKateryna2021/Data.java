/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.shmat.ShmatKateryna2021;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Data implements Serializable {
    
    private int number;
    private String name;
    private String familyname;
    private int age;
    private String email;
    
    public Data(){
    }
    
    public Data(int number, String name, String familyname, int age, String email){
        this.number=number;
        this.name=name;
        this.familyname=familyname;
        this.age=age;
        this.email=email;
        
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
       

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data{number=").append(number);
        sb.append(", name=").append(name);
        sb.append(", familyname=").append(familyname);
        sb.append(", age=").append(age);
        sb.append(", email=").append(email);
        sb.append('}');
        return sb.toString();
    }
    
    
}
