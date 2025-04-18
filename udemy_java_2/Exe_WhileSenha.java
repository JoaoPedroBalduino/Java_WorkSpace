package udemy_java_2;

import java.util.Locale;
import java.util.Scanner;

public class Exe_WhileSenha {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a senha: ");
		int senha_dig = sc.nextInt();
		int senha = 2002;
		
		while (senha != senha_dig) {
			senha_dig = sc.nextInt();
			
			if (senha != senha_dig) {
				System.out.println("Senha Invalida");
				}
		}	
		System.out.print("Senha correta!");
		
		
		sc.close();
	}

}
