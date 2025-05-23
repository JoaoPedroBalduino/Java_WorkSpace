package entities.exe;
//MainSoma_vetor

import java.util.Scanner;
public class InputHandlerQ2 {

	public static int lerTamanhoVetor (Scanner sc) {
		System.out.print("Quantos numeros vai ter o vetor: ");
		int n = sc.nextInt();
		return n;
	} 
	
	public static double[] lerVetor(Scanner sc, int n) {
		double[] vect = new double[n];
		for(int i=0;i<n;i++) {
			System.out.print("Digite o numero "+i+": ");
			vect[i]=sc.nextDouble();
		}
		return vect;
	}

}
