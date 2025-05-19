package Assignment2;

public class Vehicle {
	protected String name;
	protected int numberOfTires;
	protected Engine typeEngine;
	protected Tire typeTire;
	protected boolean driving;
	protected boolean drivingFast;

	public Vehicle() {

	}

	public Vehicle(String name, double fuel, double power, int numberOfTires, double pressure) {
		this.name = name;
		this.typeEngine = new Engine(power, fuel);
		this.numberOfTires = numberOfTires;
		this.typeTire = new Tire(pressure);
		this.driving = false;
	}

	public void accelerate(double howMuch) {
		if (howMuch > 0.5) {
			drivingFast = true;
			driving = false;
		} else {
			driving = true;
			drivingFast = false;
		}
		this.typeEngine.stepOntheGas(howMuch);

	}

	public void stop() {
		driving = false;
		drivingFast = false;
	}

	public void refillEngine() {
		double refill = this.typeEngine.getMaxEnergy();
		this.typeEngine.fuelLevel = refill;
	}

	public void bordComputer() {
		System.out.print(name);
		if (drivingFast)
			System.out.print(" driving really fast");
		else if (driving)
			System.out.print(" driving");
		else
			System.out.print(" stopped");

		System.out.println(" with " + Math.floor(this.typeEngine.gethorsePower()) + " hp");
		System.out.println(" with fuel level at " + Math.floor(this.typeEngine.getFuelLevel()) + " liters");
		System.out.println(" with " + numberOfTires + " tires ");
		System.out.println(" with pressure at " + this.typeTire.getPressure() + " bar");
	}
}
