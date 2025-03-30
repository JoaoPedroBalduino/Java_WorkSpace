package udemy_java;
import java.util.Scanner;
import java.util.Locale;

public class Aula_7exe2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// Exercício da Lista 
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Digite o comprimento do terrono:");
		double comprimento = sc.nextDouble();
		System.out.println("Digite a largura do terreno:");
		double largura = sc.nextDouble();
		System.out.println("Digite o preço do metro quadrado em R$:");
		double metro_qua = sc.nextDouble();
		
		double AREA = (comprimento * largura);
		double PRECO = (AREA * metro_qua);
		
		System.out.printf("A area total do terreno é de: %.2f m2%n",AREA);
		System.out.printf("O preço do terrno ficou: R$ %.2f%n",PRECO);
		
		sc.close();
		

		
	}

}
