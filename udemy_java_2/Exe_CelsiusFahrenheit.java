package udemy_java_2;

import java.util.Scanner;
import java.util.Locale;

public class Exe_CelsiusFahrenheit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");

			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;

			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");

			resp = sc.next().charAt(0);
						//Sgring (0) 1 2 3 4 5 6 7
			
		} while (resp != 'n');
		System.out.println("Obrigado!");

		sc.close();
	}

}
