package Assignment2;

public class TestVehicles {

	public static void main(String[] args) {
		

//			GasCar MiddleClass1 = new GasCar("VW Passat", 60, 100, 4, 2.5);
//			GasCar UpperClass1 = new GasCar("BMW 5", 80, 250, 4, 2.5);
//			GasCar LuxurySUV1 = new GasCar("Mercedes GLC", 90, 200, 4, 2.0);
			GasCar LuxurySUV2 = new GasCar("BMW X5", 40, 90, 200, 4, 2.0);
			Ecar UpperClass2 = new Ecar("Tesla Model S", 40, 80, 250, 4, 2.0);
			Ecar CityCar1 = new Ecar("FIAT 500", 15, 27, 80, 4, 2.0);

			CityCar1.accelerate(0.5);
//			// System.out.println(CityCar1.getClass());
			CityCar1.bordComputer();
	//
			UpperClass2.accelerate(0.5);
			UpperClass2.bordComputer();

			LuxurySUV2.accelerate(0.1);
			LuxurySUV2.bordComputer();
//			
//			LuxurySUV2.refillEngine();
//			LuxurySUV2.bordComputer();

			CityCar1.accelerate(0.5);
			// System.out.println(CityCar1.getClass());
			CityCar1.bordComputer();
			CityCar1.refillEngine();
			CityCar1.bordComputer();

			Vehicle[] myCars = new Vehicle[3];
			myCars[0] = CityCar1;
			myCars[1] = UpperClass2;
			myCars[2] = LuxurySUV2;
			ManageCars.refillVehicles(myCars);

			for (Vehicle vehicle : myCars) {
				vehicle.bordComputer();
			}
		}
	}

