package mains.exe;
import java.util.Scanner;
// Fiz sozinho sem usar SRP

public class MainNegativosAlphaQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor (até 10): ");
		int n =  sc.nextInt();
		int[] vect = new int[n];
		System.out.println();
		
		if(n>10 || n<0) {
			System.out.println("Número Invalido!");
		}

		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite o valor de "+ (i+1)+ " : ");
			vect[i]=sc.nextInt(); 
		}
		System.out.println();

		System.out.println("NUMEROS NEGATIVOS: ");
		for(int vect1 : vect) {
			if (vect1 < 0) {
				System.out.println(vect1);
			}
				
		}
		sc.close();
	}

}
