package com.masai;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Scanner scanString = new Scanner(System.in);
		
		
		
		System.out.println("Enter no of passengers: ");
		int p = scan.nextInt();
	
		
		System.out.println("Enter no of kms: ");
		int kms = scan.nextInt();
		
		
		OLA ola = new OLA();
		
		Car c =ola.bookCar(p,kms);
		
		
		int res = ola.calculateBill(c);
		
		System.out.println("The total fare amount is"+ res);
		
	}
	
	
	
}
