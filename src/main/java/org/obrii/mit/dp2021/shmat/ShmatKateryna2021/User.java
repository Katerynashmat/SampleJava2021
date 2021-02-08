/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.shmat.ShmatKateryna2021;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 38068
 */
public class User {

    private String name;
    private String familyname;
    private String birthday;
    private String gender;
    private List<String> language;
    private String email;

    public User() {
    }

    public User(String name, String familyname, String birthday, String gender, String[] language, String email) {
        this.name = name;
        this.familyname = familyname;
        this.birthday = birthday;
        this.gender = gender;
        if (language != null) this.language = Arrays.asList(language);
        //if (language != null) Collections.addAll(this.language, language);
        this.email = email;
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

    public void setFamilyame(String familyname) {
        this.familyname = familyname;
    }
    
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "User{" +"name=" + name + ", familyname=" + familyname + ", birthday=" + birthday + ", gender=" + gender + ", language=" + language + ", email=" + email + '}';
    }

}