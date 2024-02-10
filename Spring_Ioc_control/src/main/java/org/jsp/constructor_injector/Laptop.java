package org.jsp.constructor_injector;

public class Laptop {
	
	int ram;
	double price;
	String model;
	String brand;
	
	public Laptop(int ram, double price, String model, String brand) {
		
		this.ram = ram;
		this.price = price;
		this.model = model;
		this.brand = brand;
	}
	
	public void details()
	{
		System.out.println("Ram of the Laptop is : "+ ram);
		System.out.println("Price of the laptop is : "+price);
		System.out.println("Model of the laptop is : "+model);
		System.out.println("Brand of the laptop is : "+brand);
	}
	
	

}
