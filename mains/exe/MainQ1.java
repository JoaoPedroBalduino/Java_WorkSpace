package mains.exe;
import java.util.Scanner;

import entities.exe.InputHandlerQ1;
import entities.exe.NegativoProcessorQ1;

public class MainQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tamanho = InputHandlerQ1.lerTamanhoVetor(sc);
		int[] vetor = InputHandlerQ1.lerVetor(sc, tamanho);
		
		NegativoProcessorQ1.mostrarNegativo(vetor);
		
	sc.close();
	}
// EXEPLICAÇÃO DO CÓDIGO: https://chatgpt.com/share/6829fda6-abc8-8007-b620-53b57906b6c2
// Fazer depois!!!
}
