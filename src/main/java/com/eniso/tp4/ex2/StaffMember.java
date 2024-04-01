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

public class StaffMember extends User {
    private String qualification;
private Integer experience ;
private List<String> tasks;

    public StaffMember( String firstName, String lastName, String email, Long cin, Integer experience,String qualification, List<String> tasks) {
        super(firstName, lastName, email, cin);
        this.qualification = qualification;
        this.experience = experience;
        this.tasks = tasks;
    }


  public void updateProfile(String firstName, String lastName, String email, Long cin,String qualification, Integer experience, List<String> tasks){
   super.updateProfile( firstName,  lastName,  email,cin );
   this.qualification=qualification;
   this.experience=experience;
   this.tasks=tasks;
}

    @Override
    public String displayInfo() {
        return  "StaffMember{" +super.displayInfo()+ "qualification=" + qualification + ", experience=" + experience + ", tasks=" + tasks + '}';
    }

  
public void finishTask(String name){
    int i=tasks.indexOf(name);
    tasks.remove(i);
    
}
     @Override
    public Boolean authentification(){
    return true;
}  
}
