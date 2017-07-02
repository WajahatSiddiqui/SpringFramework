package com.wajahat.learn.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		/*BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle = (Triangle) factory.getBean("triangle");*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
				
		triangle.draw();

	}

}
