package org.jsp.constructor_injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Laptop_Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("laptop.xml");
		Laptop laptop = context.getBean(Laptop.class,"mylaptop");
		laptop.details();
		
		
	}

}
