package com.cognizant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Client {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("objects.xml");
		
		Employee employee1 = (Employee) context.getBean("emp");
		
		System.out.println(employee1.hashCode());
		
		employee1.displayEmployeeInfo();
		
Employee employee2 = (Employee) context.getBean("emp");
		
System.out.println(employee2.hashCode());
		employee2.displayEmployeeInfo();
		
		Person person1 = (Person) context.getBean("p");
		String res = person1.disp();
		System.out.println(res);
	}
} 
