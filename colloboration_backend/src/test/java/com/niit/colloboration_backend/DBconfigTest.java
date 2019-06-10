package com.niit.colloboration_backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DBconfigTest {
	public static void main(String arg[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("mer.mano");
		context.refresh();
		
		
		System.out.println("Testing DBConfig");
		
	}

}



