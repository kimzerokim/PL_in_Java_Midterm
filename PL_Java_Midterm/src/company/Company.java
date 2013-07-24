package company;

import java.util.ArrayList;

import vehicle.Vehicle;

public class Company {
	private static ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	private static Company company = new Company();

	private Company() {

	}

	public static Company getInstance() {
		return company;
	}

	public void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}

	public ArrayList<Vehicle> getVehicles() {
		return vehicleList;
	}
}
