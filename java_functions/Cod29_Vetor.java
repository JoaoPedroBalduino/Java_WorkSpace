package java_functions;
import java.util.Locale;
import java.util.Scanner;

public class Cod29_Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tamanho do Vetor: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		System.out.println( );

		double sum = 0;
		
		for(int i=0;n>i;i++) {
			System.out.print("Digite o valor de vect["+i+"]: ");
			vect[i]=sc.nextDouble();
			sum += vect[i];
		}
		double avg = sum/n;
		System.out.println( );
		System.out.printf("A media dos valores do vetor é: %.2f%n",avg);
		
	sc.close();
	}

}
