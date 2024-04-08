package com.mycompany.csc325_oop_designreview_lab;

//Freshman class that extends from the Student class that adds the name and
// age of the student and has a toString for the output

public class Freshman extends Student {
    private int credits;
    public Freshman(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;

    }

    //a toString method for the Freshman class
    @Override
    public String toString() {
        return "Freshman - Name: " + getName() + "\n Age: " + getAge() + "\n Credits: " + credits + "\n GPA: " + getGpa();
    }
}
