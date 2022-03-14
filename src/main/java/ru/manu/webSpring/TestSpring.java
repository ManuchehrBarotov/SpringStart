package ru.manu.webSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Comp comp=context.getBean("comp",Comp.class);
	
		System.out.println(comp.toString());
		
		
		context.close();

	}

}
