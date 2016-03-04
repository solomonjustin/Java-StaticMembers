package Lab11;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		int userin;
		
		System.out.println("Geometry Calculator!");
		
		do{
			System.out.println("1. Calculate area of circle.");
			System.out.println("2. Calculate area of rectangle.");
			System.out.println("3. Calculate area of triangle.");
			System.out.println("4. Quit");
			System.out.print("Enter your choice (1-4): ");
			userin = keys.nextInt();
			
			if(userin < 1 || userin > 4)
				System.out.println("invalid entry!");
		}while(userin < 1 || userin > 4);
		
		if(userin == 1)
			System.out.println("Area of circle: " + Geometry.getCircArea(20));
		else if(userin == 3)
			System.out.println("Area of triangle: " + Geometry.getTriArea(20, 60));
		else if(userin == 2)
			System.out.println("Area of rectangle: " + Geometry.getRectArea(30, 40));
		else
			System.out.println("Bye!");
		keys.close();

	}

}
