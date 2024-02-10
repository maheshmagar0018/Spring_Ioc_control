package org.jsp.constructor_injector;

public class Mouse {
	
	String brand;
	double price;
	
	public Mouse(String brand, double price) {
		
		this.brand = brand;
		this.price = price;
	}
	
	public void details()
	{
		System.out.println("Brand of mouse is "+ brand);
		System.out.println("Price of mouse is "+ price);
	}
	
	

}
