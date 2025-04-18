package udemy_java_2;

import java.util.Locale;
import java.util.Scanner;

public class Cod16_AreaTrianguloFunção {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("<< Enter the measures of triangle Y >> ");
		System.out.print("Digite o lado 1 do triangulo Y: ");
		double LadoUmTrianguloY = sc.nextDouble();
		System.out.print("Digite o lado 2 do triangulo Y: ");
		double LadoDoisTrianguloY = sc.nextDouble();
		System.out.print("Digite o lado 3 do triangulo Y: ");
		double LadoTresTrianguloY = sc.nextDouble();
		
		double p_1 = peg(LadoUmTrianguloY,LadoDoisTrianguloY,LadoTresTrianguloY);
		
		System.out.println("<< Enter the measures of triangle X >> ");
		System.out.print("Digite o lado 1 do triangulo X: ");
		double LadoUmTrianguloX = sc.nextDouble();
		System.out.print("Digite o lado 2 do triangulo X: ");
		double LadoDoisTrianguloX = sc.nextDouble();
		System.out.print("Digite o lado 3 do triangulo X: ");
		double LadoTresTrianguloX = sc.nextDouble();
	
		double p_2 = peg(LadoUmTrianguloX,LadoDoisTrianguloX,LadoTresTrianguloX);
		
		double areaX = Math.sqrt(p_2*(p_2-LadoUmTrianguloX)*(p_2-LadoDoisTrianguloX)*(p_2-LadoTresTrianguloX));
		double areaY = Math.sqrt(p_1*(p_1-LadoUmTrianguloY)*(p_1-LadoDoisTrianguloY)*(p_1-LadoTresTrianguloY));
		
		System.out.printf("Triangle Y area: %.5f%n", areaY);
		System.out.printf("Triangle X area: %.5f%n", areaX);
	
		 if (areaX > areaY) {
	            System.out.println("Larger = X");
	        } else {
	            System.out.println("Larger = Y");
	        }

		
		 sc.close();
		}//chave da função

		public static double peg(double x, double y, double z) {
			Locale.setDefault(Locale.US);
			double aux = (x + y + z)/2;
			return aux;
		
		}
	
}//chave da classe 
