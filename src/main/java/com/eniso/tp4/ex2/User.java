/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp4.ex2;


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

public class User {
    private String firstName;
private String lastName;
private String email;
private Long cin;

    public User(String firstName, String lastName, String email, Long cin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cin = cin;
    }





  
    public String displayInfo() {
        return "User{" + "firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", cin=" + cin + '}';
    }


public void updateProfile(String firstName, String lastName, String email, Long cin){
    this.firstName=firstName;
    this.lastName=lastName;
    this.email=email;
    this.cin=cin;
        
}
public Boolean authentification(){
    return true;
}
}

