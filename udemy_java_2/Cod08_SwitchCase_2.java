package udemy_java_2;

import java.util.Scanner;

public class Cod08_SwitchCase_2 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		System.out.print("Digite sua informação: ");
		String nome = sr.nextLine();

		switch (nome) {
		case "nome":
			nome = ("João Pedro");
			break;
		case "idade":
			nome = ("22 anos");
			break;
		default:
			nome = ("erro!");
			break;
		}
		//O ".equals" é a forma de comparação de Strings igual a "=="
		if (nome.equals("João Pedro")) {
			System.out.println("Seu nome é: " + nome);
		
		} else if (nome.equals("22 anos")) {
			System.out.println("Sua idade é de: " + nome);
		
		} else {
			System.out.println("Entrada inválida.");
		}

		sr.close();
	}
}