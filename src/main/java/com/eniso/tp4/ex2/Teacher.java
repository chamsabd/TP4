/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex2;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author chams
 */
@Getter
@Setter
@NoArgsConstructor

public class Teacher extends User{
   private Long hIndex;
   private List<Course> courses;
   
     public void updateProfile(String firstName, String lastName, String email, Long cin,Long hIndex, List<Course> courses){
   super.updateProfile( firstName,  lastName,  email,  cin);
   this.hIndex=hIndex;
    this.courses=courses;
}

    public Teacher(String firstName, String lastName, String email, Long cin,Long hIndex, List<Course> courses) {
        super(firstName, lastName, email, cin);
        this.hIndex = hIndex;
        this.courses = courses;
    }
     
     
     
     

       @Override
    public String displayInfo() {
        return "Teacher{" +super.displayInfo() + "hIndex=" + hIndex + ", courses=" + displayCoursesContent() + '}';
    }
    public String displayCoursesContent(){
        String r="Course{ ";
        for(Course c: courses){
            r+=c+" ";
        }
         r+="} ";
         return r;
    }
   @Override
    public Boolean authentification(){
    return true;
}
}
