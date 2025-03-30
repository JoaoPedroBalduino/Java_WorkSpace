package udemy_java_2;
import java.util.Scanner;
public class Aula_11 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		
		System.out.print("Digite o valor total da compra: ");
		double preco = sr.nextDouble();
		
		double desconto = (preco > 50) ? preco * 0.20 : preco * 0.10;

		System.out.println("O desconto ficou de: R$ "+ desconto);
		System.out.println("Preço final: R$ "+ (preco - desconto));
		
		sr.close();
		
		//SE FOSSE USANDO "IF E ELSE"!!!
		
		//double preco = 34.5;
		//double desconto;
		//if (preco < 20.0) {
		//desconto = preco * 0.1;
		//}
		//else {
		//desconto = preco * 0.05;
	}

}

