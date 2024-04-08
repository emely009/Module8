/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

// Child of the human class
public class Student extends Human {
    private double gpa; // Adds a field for GPA


    public Student(String name, int age) {
        super(name, age);
    }

    public double getGpa() { // Getter for GPA
        return gpa;
    }

    public void setGpa(double gpa) { // Setter for GPA
        this.gpa = gpa;
    }

    // a toString method for the Student class
    @Override
    public String toString() {
        return "Student - Name: " + getName() + ", Age: " + getAge() + ", GPA: " + gpa ;
    }

    // methods from Human class
    @Override
    public String getAddress() {

        return null;
    }

    @Override
    public void setAddress(String address) {

    }

}
