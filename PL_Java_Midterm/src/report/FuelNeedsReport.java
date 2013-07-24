package report;

import java.io.PrintStream;

import vehicle.Vehicle;

import company.Company;

public class FuelNeedsReport {
	static final String NEWLINE = System.getProperty("line.separator");

	Company c = Company.getInstance();
	Vehicle curVehicle;
	double fuel;

	String vehicleInfo(Vehicle vehicle, int i) {
		StringBuilder curVehicleInfo = new StringBuilder();
		
		curVehicleInfo.append("Vehicle Number	: ");
		curVehicleInfo.append(i + 1); // for naming Vehicle number from 1
		curVehicleInfo.append(NEWLINE);
		curVehicleInfo.append("Distance	: ");
		curVehicleInfo.append(vehicle.clacTripDistance());
		curVehicleInfo.append(NEWLINE);
		curVehicleInfo.append("Efficiency	: ");
		curVehicleInfo.append(vehicle.clacFuelEfficiency());
		curVehicleInfo.append(NEWLINE);
		curVehicleInfo.append("Fuel		: ");
		curVehicleInfo.append(vehicle.calFuelNeeds());
		curVehicleInfo.append(NEWLINE);

		return curVehicleInfo.toString();
	}
	
	double calWholeFuel (Vehicle vehicle, int i) {
		double wholeFuel = vehicle.calFuelNeeds();
		
		return wholeFuel;
	}

	public void generateText(PrintStream out) {
		String 	curVehicleInfo;
		double	wholeFuel = 0;
		
		System.out.println("======Fuel Report======"+NEWLINE);
		
		for (int i = 0; i < c.getVehicles().size(); i++) {
			curVehicle = c.getVehicles().get(i);
			curVehicleInfo = vehicleInfo(curVehicle, i);
			wholeFuel += calWholeFuel(curVehicle, i);
			System.out.println(curVehicleInfo);
		}
		
		System.out.print("Whole Fuel	: ");		
		System.out.println(wholeFuel);		
	}
}
