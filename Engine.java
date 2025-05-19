package Assignment2;

public class Engine {
	protected double fuelLevel;
	protected double maxFuelLevel;
	protected double maxEnergy;
	protected double power;

	public Engine() {

	}

	// constructor
	public Engine(double kw, double fuel) {
		power = kw;
		fuelLevel = fuel;

	}

	// access fuelLevel
	public double getFuelLevel() {
		return fuelLevel;
	}

	public void stepOntheGas(double howMuch) {
		if (howMuch <= 0.5) {
			fuelLevel = fuelLevel * 0.95;
		} else {
			fuelLevel = fuelLevel * 0.70;
		}
	}

	// returns the power of the car in hp
	public double gethorsePower() {
		return this.power * 1 / 0.75;
	}

	//CC8.1
	public double getMaxEnergy() {
		return maxFuelLevel;
	} 

}
