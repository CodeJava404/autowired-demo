package org.info;

import org.info.bean.VehicleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {


		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		
		VehicleService vehicleObj = (VehicleService) context.getBean(VehicleService.class);
		vehicleObj.functionOfVehicle();

		
	}
}
