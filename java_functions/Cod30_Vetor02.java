package java_functions;
import java.util.Locale;
import java.util.Scanner;
import entities.Vetor02;

public class Cod30_Vetor02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o tamanho do Vetor: ");
		int n = sc.nextInt();
		Vetor02[] vect = new Vetor02[n];
		
		for(int i=0; i<n; i++) { // Pode-se usar "vect.lenght"
			sc.nextLine(); // evitar o buffer
			
			System.out.println("Digite o nome do product: ");
			String name = sc.nextLine();
			
			System.out.println("Digite o preço: ");
			double price = sc.nextDouble();

			vect[i] = new Vetor02(name, price);
			sc.nextLine();
		}
		
		double sum = 0;
		for(int i=0; i<n; i++) {
			sum += vect[i].getPrice();		
		}
		double avg = sum / n;
		System.out.printf("A media dos preços é: %.2f%n",avg);
		
		sc.close();
	}

}
