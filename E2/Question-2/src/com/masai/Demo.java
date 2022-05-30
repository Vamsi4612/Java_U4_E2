package com.masai;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		Scanner scanString = new Scanner(System.in);
		System.out.println("Enter no of students: ");
		int num = scan.nextInt();
		
		Student[] students = new Student[num];
		
		for(int i=0;i<num;i++) {
			
			students[i] = new Student();
			
			System.out.println("Enter student name: ");
			String name = scanString.nextLine();
			students[i].setName(name);
			System.out.println("Enter student roll: ");
			int roll = scan.nextInt();
			students[i].setRoll(roll);
			System.out.println("Enter student address: ");
			String address = scanString.nextLine();
			students[i].setAddress(address);
			System.out.println("Enter student marks: ");
			int marks = scan.nextInt();
			students[i].setMarks(marks);
			
		}
		
		int totalMarks = 0;
		
		
		for(int i=0;i<num;i++) {
		System.out.println("Student - "+i+1+"details: ");	
		System.out.println("======================");
		System.out.println("Student name: "+students[i].getName());
		System.out.println("Student roll no: "+students[i].getRoll());
		System.out.println("Student address: "+students[i].getAddress());
		System.out.println("Student marks: "+students[i].getMarks());
		System.out.println(" ");
		totalMarks = totalMarks + students[i].getMarks();
		
		}
		
//		System.out.println(totalMarks);
		int avg = totalMarks/num;
		System.out.println("Average of all the Student marks: "+avg);
		
	}
	
	
}
