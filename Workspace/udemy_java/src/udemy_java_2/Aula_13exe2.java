package udemy_java_2;
import java.util.Scanner;

public class Aula_13exe2 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		
		System.out.print("Digite o número do produto: ");
		
		
		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;
		
		int tipo = sr.nextInt();// tipo é o indexador
		
		while (tipo != 4) { 
			
			if (tipo == 1) {
				alcool += alcool + 1;
			}
			else if (tipo == 2) {
				gasolina += gasolina + 1;
			}
			else if (tipo == 3) {
				diesel += diesel + 1;
			}
			
			tipo = sr.nextInt();
		
		}
		System.out.println("Muito Obrigado!");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		
		sr.close();
	}

}
