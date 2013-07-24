package vehicle;

public class RiverBarge extends Vehicle {
	double distance;
	double efficiency;

	public RiverBarge(double dist, double eff) {
		this.distance = dist;
		this.efficiency = eff;
	}

	@Override
	public double clacFuelEfficiency() {
		return this.efficiency;
	}

	@Override
	public double clacTripDistance() {
		return this.distance;
	}
}
