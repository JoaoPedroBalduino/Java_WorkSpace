package udemy_java;
import java.util.Scanner;
import java.util.Locale;

public class Aula_8exe3 {
	//Exercício 03 da Lista 02
	
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite o 1º número: ");
		int num_1 = sr.nextInt();
		
		System.out.print("Digite o 2º número: ");
		int num_2 = sr.nextInt();
		
		//Outro jeito de fazer if (A % B == 0 || B % A == 0) usando OU( || )
		//Math.max - retorna o maior número
		int maior = Math.max(num_1, num_2);
		int menor = Math.min(num_1, num_2);
		//Math.min - retorna o menor número
		
		if (maior % menor == 0) {
			System.out.println(maior + " é SIM múltiplo de "+ menor);
		}else{
			System.out.println(maior + " NÃO é múltiplo de "+ menor);
		}
		
	sr.close();
		
		
		
		
		
	
	
	}

}
