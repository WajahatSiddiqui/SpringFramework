package com.wajahat.learn.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		/*BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle = (Triangle) factory.getBean("triangle");*/
		
		// Setter/Constructor Injection
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		// Object Injection
		TrainglePoint trainglePoint = (TrainglePoint) context.getBean("triangle-point");
		System.out.println(trainglePoint);

		// Inner bean
		TrainglePoint trainglePointInner = (TrainglePoint) context.getBean("triangle-point-inner");
		System.out.println(trainglePointInner);
		
		
		// Alais Inner bean
		TrainglePoint innerBean = (TrainglePoint) context.getBean("inner-bean");
		System.out.println(innerBean);

		// Injecting collection
		TraingleList traingleList = (TraingleList) context.getBean("triangle-list");
		traingleList.draw();
	}

}
