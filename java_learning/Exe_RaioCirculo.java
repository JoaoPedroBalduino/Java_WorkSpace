package java_learning;
import java.util.Locale;
import java.util.Scanner;

public class Exe_RaioCirculo {
// Exercício 02 da Lista
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o raio da circuferência: ");
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * (Math.pow(raio,2.0));
		
		System.out.printf("A área do círculo é: %.4f%n",area);
		
		sc.close();
	
	
	
	
	}

}
