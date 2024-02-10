package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cow_Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Cow.xml");
		Cow cow = (Cow) context.getBean("mycow");
		cow.eat();
		cow.doSound();
		
	}

}
