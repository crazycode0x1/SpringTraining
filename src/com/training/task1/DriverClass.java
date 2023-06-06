package com.training.task1;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DriverClass {

	public static void main(String[] args) {
	//	38010073// TODO Auto-generated method stub
		
	//Starting IOC container
		ClassPathXmlApplicationContext context=
                 new ClassPathXmlApplicationContext("applicationContaxt.Xml"); 
		
		//retriving the beans
		
		PythonLanguage pl=context.getBean("Framework",PythonLanguage.class);
		System.out.println(pl.learningPython());	
	
		
		
		
		
		
		//closing Ioc container
		context.close();
	}

}
