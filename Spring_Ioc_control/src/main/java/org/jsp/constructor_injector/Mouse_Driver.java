package org.jsp.constructor_injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mouse_Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("mouse.xml");
		Mouse mouse = context.getBean(Mouse.class,"mymouse");
		mouse.details();
		
		
	}

}
