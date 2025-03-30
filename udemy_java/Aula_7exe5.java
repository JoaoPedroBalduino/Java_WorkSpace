package udemy_java;
import java.util.Locale;
import java.util.Scanner;

public class Aula_7exe5 {
	//Exercício 03 da Lista
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número A : ");
		int a = sc.nextInt();
		System.out.print("Digite o número B : ");
		int b = sc.nextInt();
		System.out.print("Digite o número C : ");
		int c = sc.nextInt();
		System.out.print("Digite o número D : ");
		int d = sc.nextInt();
		
		int cal =((a*b)-(c*d));
		//2520
		System.out.printf("O resultado do cálculo: %d%n",cal);
		
		sc.close();

	}

}
