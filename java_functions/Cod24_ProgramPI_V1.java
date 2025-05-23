package java_functions;
import java.util.Locale;
import java.util.Scanner;

public class Cod24_ProgramPI_V1 {
	//Versão 1: Método na própria classe do programa
	
	public static final double PI = 3.14159;
	//Para torna uma "constante" coloca-se o "final" na declaração. 
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
	
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius); 
		//método circumference ira calcular e devolver o valor
	
		double v = volume(radius);
		//método volume ira calcular e devolver o valor	
	
		System.out.printf("Circumference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("PI value: %.2f%n", PI);
		
	sc.close();
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3)/3;
		//outro jeito de fazer seria (4.0 * PI * radius * radius * radius)
	
	//OBS: Se eu tira o "static" o programa não vai funcionar 
	// por conta que a classe "main" é static tbm!
	
	}
	
}
