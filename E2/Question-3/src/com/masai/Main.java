package com.masai;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Scanner scanString = new Scanner(System.in);
		
		Car car = new Car();
		
		System.out.println("Enter no of passengers: ");
		int p = scan.nextInt();
		car.setNumberOfPassenger(p);
		
		System.out.println("Enter no of kms: ");
		int kms = scan.nextInt();
		car.setNumberOfKms(kms);
		
		OLA ola = new OLA();
		
		Car c =(HatchBack)ola.bookCar(p,kms);
		
		
		int res = ola.calculateBill(c);
		
		System.out.println("The total fare amount is"+ res);
		
	}
	
	
	
}
