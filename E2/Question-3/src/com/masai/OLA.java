package com.masai;

public class OLA {
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			HatchBack h = new HatchBack();
			return h;
		}
		else {
			Sedan s = new Sedan();
			return s;
		}
		
	}

	public int calculateBill(Car car) {
		
		int Totalfare=car.getNumberOfKms()*car.farePerKm;
		return Totalfare;
	}
	
	
}
