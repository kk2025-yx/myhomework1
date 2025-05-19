package Assignment2;

public class ManageCars {

	public static void refillVehicles(Vehicle[] vehicles) {

		for (Vehicle vehicle : vehicles) {
			vehicle.stop();
			vehicle.refillEngine();
		}
	}

}
