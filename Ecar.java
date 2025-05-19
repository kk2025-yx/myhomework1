package Assignment2;

public class Ecar extends Vehicle {
	public Ecar(String name, double load, double maxEnergy, double power, int numberOfTyres, double pressure) {
		this.name = name;
		this.typeEngine = new EEngine(power, load, maxEnergy);
		this.numberOfTires = numberOfTires;
		this.typeTire = new Tire(pressure);
		this.stop();
	
	}
		
	public void bordComputer() {
 		System.out.print(this.name);
		if (this.drivingFast)
			System.out.print(" driving really fast");
		else if (this.driving) 
			System.out.print(" driving");
		else
			System.out.print(" stopped");
	
		System.out.println(" with " + Math.floor(this.typeEngine.gethorsePower()) + " hp");
		//hier ist der Fehler - Zugriff auf die Methode der Super-Klasse - warum?
		//EEngine thisEngine;
		//thisEngine = ((EEngine)this.typeEngine);
		double level = this.typeEngine.getFuelLevel();
		double max = this.typeEngine.getMaxEnergy();
		level = Math.floor(level/max*100);
		System.out.println(" with charging status at " + level + " Percent");
		System.out.println(" with " + numberOfTires + " tyres ");
		System.out.println(" with pressure at " + typeTire.getPressure() + " bar");
	}

	}


	
