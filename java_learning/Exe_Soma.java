package java_learning;
import java.util.Scanner;
import java.util.Locale;

public class Exe_Soma {
	//Exercício 01 da Lista
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double numero1 = sc.nextDouble();
		System.out.print("Digite outro número: ");
		double numero2 = sc.nextDouble();
		System.out.println();
		
		double soma = (numero1 + (numero2));
		
		System.out.printf("O resultado da soma: %.2f%n",soma);
		
		sc.close();

	}

}
