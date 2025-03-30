package udemy_java;
import java.util.Locale;
import java.util.Scanner;

public class Aula_7exe7 {
//Exercício 05 da Lista
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sr = new Scanner(System.in);
		
		System.out.print("Digite o código da peça 1: ");
		int obj_1 = sr.nextInt();
		System.out.print("Digite o código da peça 2: ");
		int obj_2 = sr.nextInt();
		
		System.out.println();
		
		System.out.print("Quantidade da peça 1: ");
		double quantidade_1 = sr.nextDouble();
		System.out.print("Quantidade da peça 2: ");
		double quantidade_2 = sr.nextDouble();
		
		System.out.println();
		
		System.out.print("O Preço da peça 1: ");
		double preco_1 = sr.nextDouble();
		System.out.print("O Preço da peça 2: ");
		double preco_2 = sr.nextDouble();
		
		System.out.println();
		
		double cal = ((quantidade_1*preco_1)+(quantidade_2*preco_2));
		System.out.println("O valor total R$"+cal);
		System.out.println("Número das peças "+ obj_1 +" e "+ obj_2);
		
		sr.close();
		
		
		
		
		
		

	}

}
