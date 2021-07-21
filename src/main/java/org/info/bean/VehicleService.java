package org.info.bean;

import org.info.service.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class VehicleService {
	/**
	 * @author - Santosh
	 */


	@Autowired
	@Qualifier("busBean")
	private Vehicle vehicle;

	public void functionOfVehicle() {

		vehicle.start();
		vehicle.stop();
	}

}
