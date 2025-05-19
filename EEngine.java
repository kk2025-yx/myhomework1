package Assignment2;

public class EEngine extends Engine {
	// constructor
		public EEngine(double kw, double load, double maxEnergy) {
			this.power = kw;
			this.fuelLevel = load;
			this.maxEnergy = maxEnergy;
		}


		public double getMaxEnergy() {
			return this.maxEnergy;
		}
		
	
	
}
