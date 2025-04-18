package udemy_java;
import java.util.Scanner;

public class Exe_Par_Impar {
	//Exercício 02 da Lista 02
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = sr.nextInt();
		
		boolean cal = num % 2 == 0;
		if (cal == true) {
			System.out.println("O número é PAR");
		}
		else {
			System.out.println("O número é IMPAR");
		}
		sr.close();
	}

}
