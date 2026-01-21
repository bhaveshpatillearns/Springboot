package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

public class DemoApplication {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Audi");
		System.out.println("Vehicle name from non-spring context is : "+vehicle.getName());


		var context =  new AnnotationConfigApplicationContext(ProjectConfig.class);
		Vehicle primary_veh = context.getBean(Vehicle.class);
		System.out.println("The Primary Vehicle from Spring Context is : "+primary_veh.getName());

		Vehicle veh = context.getBean("vehicle", Vehicle.class);
		System.out.println("Vehicle name from the Spring context is : "+veh.getName());

		Vehicle veh1 = context.getBean("vehicle1",Vehicle.class);
		System.out.println("Vehicle1 name from the Spring context is : "+veh1.getName());

		Vehicle veh2 = context.getBean("vehicle2", Vehicle.class);
		System.out.println("Vehicle2 name from the Spring context is : "+veh2.getName());

		Vehicle veh3 = context.getBean("vehicle3", Vehicle.class);
		System.out.println("Vehicle3 name from the Spring context is : "+veh3.getName());

		String hello = context.getBean(String.class);
		System.out.println("String bean from Spring Context is : "+hello);

		Integer num = context.getBean(Integer.class);
		System.out.println("Integer bean from Spring context is : "+num);

		Float calc = context.getBean(Float.class);
		System.out.println("Sum of two numbers from Spring context is : "+calc);

		context.close();
	}

}
