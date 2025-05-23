package entities;

public class Calculator {

	public static final double PI = 3.14159;
	//public final double PI = 3.14159; (v2 - se os metodos não fossem estaticos)
	
	
	//public double circumference(double radius) (v2 - se os metodos não fossem estaticos)
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	
	//public double volume(double radius) (v2 - se os metodos não fossem estaticos)
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3)/3;
	}
}

//OBS: Como o PI é uma constante, ou seja os metodos 
// são estaticos pq não precisam de objeto para serem chamados