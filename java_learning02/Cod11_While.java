package java_learning02;

import java.util.Locale;
import java.util.Scanner;

public class Cod11_While {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		System.out.print("Terminou o programa e a soma deu "+ soma);
		sc.close();
	}
	

}
