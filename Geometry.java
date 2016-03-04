package Lab11;

public class Geometry {
	//static methods
	public static double getCircArea(double radius){
		if(radius < 0)
			return 0;
		else
			return Math.PI * Math.sqrt(radius);
	}
	
	public static double getRectArea(double length, double width){
		
		if(length < 0 || width < 0)
			return 0;
		else
			return length * width;
	}
	
	public static double getTriArea(double base, double height){
		
		if(base < 0 || height < 0)
			return 0;
		else
			return base * height * 0.5;
	}

}
