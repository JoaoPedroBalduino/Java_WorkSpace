package java_learning;
import java.util.Scanner;
import java.util.Locale;

public class Cod7_Função2ºgrau {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// Algoritmo para a descobri as raizer 
		//de uma função do 2º grau
		// APENAS PARA EQUAÇÕES DE DELTA POSITIVO!!!
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double delta;
		double x1;
		double x2;
		
		System.out.println("Digite o valor de 'a': ");
		a = sc.nextDouble();
		System.out.println("Digite o valor de 'b': ");
		b = sc.nextDouble();
		System.out.println("Digite o valor de 'c': ");
		c = sc.nextDouble();
		
		delta = Math.pow(b,2.0) - 4*a*c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0*a);
		x2 = (-b - Math.sqrt(delta)) / (2.0*a);
		
		System.out.println("Resoltados Encontrados:");
		System.out.println("delta:");
		System.out.println(delta);
		System.out.println("x1:");
		System.out.println(x1);
		System.out.println("x2:");
		System.out.println(x2);
		
		sc.close();
		
		
		
				
				
				
		
				
		
		

	}

}
