package org.jsp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Pen_Driver {
	
	public static void main(String[] args) {
		
		//Application Context
//		ApplicationContext context = new ClassPathXmlApplicationContext("Cow.xml");
//		Pen pen = (Pen) context.getBean("mypen");
//		pen.penPrice(20);
//		pen.uses();
		
		//Bean Factory
		Resource resource = new ClassPathResource("Cow.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Pen pen = (Pen) factory.getBean("mypen");
		pen.penPrice(30);
		pen.uses();
		 
	}

}
