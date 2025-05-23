package mains.exe;
import java.util.Scanner;

public class SomaVetorAphaQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.print("Quantos numeros vai ter o vetor: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
	System.out.println( );
	
	for(int i=0;i<n;i++) {
		System.out.print("Digite o numero "+i+": ");
		vect[i]=sc.nextDouble();
	}	
	
	System.out.println( );
	System.out.print("VALORES = ");
	
	for(int i=0;i<n;i++) {
		System.out.printf("%.1f ",vect[i]);
	}
	
	double soma = 0;
	
	for(double ve : vect) {
		soma += ve;
	}
	double media = soma/3;
	
	System.out.printf("\nSOMA = %.2f\n",soma);
	System.out.printf("MEDIA = %.2f\n",media);
	
	sc.close();	
	}

}
