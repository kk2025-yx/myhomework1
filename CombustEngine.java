package Assignment2;

public class CombustEngine extends Engine {
	// constructor
			public CombustEngine(double kw, double fuel, double maxFuelLevel) {
				this.power = kw;
				this.fuelLevel = fuel;
				this.maxFuelLevel = maxFuelLevel;
			}
		
			public double getMaxEnergy() {
				return this.maxFuelLevel;
			}

	
	}
