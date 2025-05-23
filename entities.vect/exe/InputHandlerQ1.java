package entities.exe;
import java.util.Scanner;
//InputHandler = Manipulador de entrada

public class InputHandlerQ1 {

	public static int lerTamanhoVetor (Scanner sc) {
		
		int n;
		do {
			System.out.print("Digite o tamanho do vetor (até 10): \n");
			n = sc.nextInt();
			System.out.println( );
			if(n > 10 || n < 0) {
				System.out.println("Número Inválido!");
			}
		} while (n > 10 || n < 0);
		return n;
	}
	
	public static int[] lerVetor(Scanner sc, int tamanho) {
		int[] vetor = new int[tamanho];
        
		for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor de " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }
        return vetor;
    	}
	}