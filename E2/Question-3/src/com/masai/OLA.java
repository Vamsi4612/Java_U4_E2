package com.masai;

public class OLA {
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			HatchBack h = new HatchBack(numberOfPassenger,numberOfKMs);
			return h;
		}
		else {
			Sedan s = new Sedan(numberOfPassenger,numberOfKMs);
			return s;
		}
		
	}

	public int calculateBill(Car car) {
		 if(car instanceof Sedan){
	            Sedan sedan = (Sedan) car;
	            return ((Sedan) car).farePerKm*car.getNumberOfKms();
	        }
	        else{
	            HatchBack hatchBack = (HatchBack) car;
	            return ((HatchBack) car).farePerKm*car.getNumberOfKms();
	        }
	}
	
	
}
