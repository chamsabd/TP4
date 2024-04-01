/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp4.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chams
 */

public class TP4 {
public static void main(String[] args) {
  
Student student = new Student("student1", "student1", "student@email.com", 12345L, 15.0, Classe.IA1_2, Status.NON_REDOUBLANT);
System.out.println( student.displayInfo());
student.updateProfile("student11", "student11", "john.doe.new@email.com");
System.out.println(student.displayInfo());
boolean isAuthenticatedStudent = student.authentification();
System.out.println("Student Authentication: " + isAuthenticatedStudent);
Course mathCourse = new Course("Math", new ArrayList(List.of("Algebra", "Calculus")), 2.0f);
Course physicsCourse = new Course("Physics", new ArrayList(List.of("Mechanics", "Thermodynamics")),
1.5f);
Teacher teacher = new Teacher("teacher1", "teacher1", "teacher1@email.com", 67890L, 12L, new ArrayList(List.of(mathCourse, physicsCourse)));
teacher.setHIndex(10L);
System.out.println(teacher.displayInfo());
System.out.println(teacher.displayCoursesContent());

StaffMember staffMember = new StaffMember("member1", "member1", "member1@email.com", 11111L,3,"Engineer", new ArrayList<>(List.of("Task1", "Task2", "Task3")));
System.out.println(staffMember.displayInfo());
staffMember.finishTask("Task2");
System.out.println(staffMember.displayInfo());
}
}
