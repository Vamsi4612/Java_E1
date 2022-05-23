package com.masai;

public class Car {
	String model;
	String companyName;
	String Color;
	Engine engine;
	
	public class Engine{
		int rmp;
		int Power;
		String manufacturer;
		Boolean hasTurbo;
		
		void enable(Boolean x) {
			this.hasTurbo = x;
		}
	}
	
	public Car() {
		this.model = "duster";
		this.companyName = "foxd";
		this.Color = "white";
		Engine e = new Engine();
		e.rmp =40000;
		e.Power = 150;
		e.enable(true);
	}
	
	public Car(String model,String cmpName,String clr,int rmp,int power,String manfacturer,Boolean x) {
		this.model = model;
		this.companyName = cmpName;
		this.Color = clr;
		Engine e = new Engine();
		e.rmp =rmp;
		e.Power = power;
		e.manufacturer = manfacturer; 
		e.enable(x);
		
	}
	
	
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("Harrier","Tata","black",10000,110,"tata",true);
		
		
		System.out.println(c2.model);
		System.out.println(c2.companyName);
		System.out.println(c2.Color);
		System.out.println(c2.new Engine().rmp);
		System.out.println(c2.new Engine().Power);
		System.out.println(c2.new Engine().manufacturer);
		System.out.println(c2.new Engine().hasTurbo);
	}
}
