package udemy_java_lista;

import java.util.Locale;
import java.util.Scanner;

public class lista_04_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite um Número:");
		int n = sc.nextInt();
		int in = 0;
		
		for (int i=0; i<n; i++) {
			int numero = sc.nextInt();
			if (numero>=10 && numero<=20) {
				in += 1;
			}
		
		}
		System.out.println("-----------------");
		System.out.println(in + " in > (10-20)");
		System.out.println((n-in)+" out > (10-20)");
		sc.close();
	}
}
