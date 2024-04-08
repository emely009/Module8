/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		//Sets freshmen student with name and age
		Freshman std1 = new Freshman("James", (int)20,20);
		//Sets senior student with name, age and credits
		Senior std2 = new Senior("John", (int)30, 90);


		Scanner scanner = new Scanner(System.in); // Scanner for user input

		// Sets the gpa of the student using the scanner and user
		// input and then print the output.
		System.out.print("Enter GPA for James: ");
		double gpa = scanner.nextDouble();
		std1.setGpa(gpa);

		System.out.print("Enter GPA for John: ");
		double seniorGpa = scanner.nextDouble();
		std2.setGpa(seniorGpa);


		System.out.println(std1);
		System.out.println(std2);

	}
}

