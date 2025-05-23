package java_functions;
import java.util.Locale;
import java.util.Scanner;
import entities.Calculator;

public class Cod25_ProgramPI_V2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Calculator calc = new Calculator(); >> Método de instância
		//Foi instanciado o método Calculator (calc)
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		//double c = calc.circumference(radius); >> Método de instância
		double c = Calculator.circumference(radius);
		
		//double v = calc.volume(radius); >> Método de instância
		double v = Calculator.volume(radius);

		System.out.printf("Circumference : %.2f%n",c);
		System.out.printf("Volume : %.2f%n",v);
		System.out.printf("PI : %.2f%n",Calculator.PI); //>> Método de instância
	
		sc.close();
	}

}
