package Assignment2;

public class GasCar extends Vehicle {
	public GasCar(String name, double fuel, double maxFuelLevel, double power, int numberOfTyres, double pressure) {
		this.name = name;
		this.typeEngine = new CombustEngine(power, fuel, maxFuelLevel);
		this.numberOfTires = numberOfTires;
		this.typeTire = new Tire(pressure);
		this.stop();
		
	}
	}


