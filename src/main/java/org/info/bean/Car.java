package org.info.bean;

import org.info.service.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * author @Santosh
 */

@Component

@Qualifier("carBean")
public class Car implements Vehicle {

	public void start() {
		// TODO Auto-generated method stub

		System.out.println("I am start method from Car class");

	}

	public void stop() {

		System.out.println("I am stop method from Car class");

	}
	/**
	 * @author - Santosh
	 */
}
