/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex2;

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

public class Student extends User{
 private Double average;
 private Classe classe;
 private Status status;

    public Student( String firstName, String lastName, String email, Long cin,Double average, Classe classe, Status status) {
        super(firstName, lastName, email, cin);
        this.average = average;
        this.classe = classe;
        this.status = status;
    }
    
    public void updateProfile(String firstName, String lastName, String email){
   
   super.updateProfile( firstName,  lastName,  email,0L);
}

    @Override
    public String displayInfo() {
        return "Student{" +super.displayInfo()+ "average=" + average + ", classe=" + classe + ", status=" + status + '}';
    }
     @Override
    public Boolean authentification(){
    return true;
}
}
