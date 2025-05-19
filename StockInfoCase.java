package Assignment2;

import static Prog1Tools.IOTools.readInteger;
import Prog1Tools.IOTools;

public class StockInfoCase {

	public static void main(String[] args) {
		System.out.print(
				"Please specify the ID for the type of the component: \n Wheel: 1 \n Handlebar: 2 \n Saddle: 3 \nID:> ");

		int ID = 0;// users input 1-3 to choose a component
		ID = readInteger("Please specify the ID for the type of the component:");
		
		switch (ID) {
		case 1:
			int Wheel = IOTools.readInt("Wheel:");
			
			int c1 = IOTools.readInt("Wheel Consumption per week: >");
			
			int t1 = IOTools.readInt("Wheel Delivery Time:> ");
			double minStock1 = (c1) * (t1) * (1 + 0.5);
			

			System.out.print("Miminal number of wheels in stock: ");
			System.out.println(Math.ceil(minStock1));
			
		case 2:
			int Handlebar = IOTools.readInt("Handlebar:");
			int c2 = IOTools.readInt("Handlebar Consumption per week:> ");
			int t2 = IOTools.readInt("Handlebar Delivery Time:> ");
			double minStock2 = (c2) * (t2) * (1 + 0.2);
			System.out.print("Miminal number of Handlebar in stock: ");
			System.out.println(Math.ceil(minStock2));
			break;
		case 3:
			int Saddle = IOTools.readInt("Saddle:");
			int c3 = IOTools.readInt("Saddle Consumption per week:> ");
			int t3 = IOTools.readInt("Saddle Delivery Time: >");
			double minStock3 = (c3) * (t3) * (1 + 0);
			System.out.print("Miminal number of Saddle in stock: ");
			System.out.println(Math.ceil(minStock3));
		default:
			break;
		}
	}

}
	
	

