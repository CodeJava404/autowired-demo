package org.info.bean;

import org.info.service.Vehicle;
import org.springframework.stereotype.Component;

/** author @Santosh
*/


@Component
public class Bus implements Vehicle{

	public void start() {
		// TODO Auto-generated method stub
		
		System.out.println("I am start method from Bus class");
		
	}

	public void stop() {

		System.out.println("I am stop method from Bus class");
		
		
	}
	/**
	@author - Santosh
	*/
}
