package com.mycompany.csc325_oop_designreview_lab;
//The senior class that extends from the Student class that sets name and age of the student
// and sets a minimum of 85 credits and contains a toSting
// for the output
public class Senior extends Student {
    private int credits;


    //sets credit to a minimum of 85
    public Senior(String name, int age, int credits) {
        super(name, age);
        this.credits = Math.max(credits, 85);
    }

    // a toString method for the Senior class
    @Override
    public String toString() {
        return "\nSenior - Name: " + getName() + "\n Age: " + getAge() + "\n Credits: " + credits + "\n GPA: " + getGpa() ;
    }
}
