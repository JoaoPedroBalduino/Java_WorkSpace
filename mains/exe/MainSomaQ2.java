package mains.exe;
import java.util.Scanner;

import entities.exe.InputHandlerQ2;
import entities.exe.VetorCalculatorQ2;
import entities.exe.ViewVectQ2;

public class MainSomaQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tamanho = InputHandlerQ2.lerTamanhoVetor(sc);
		double[] vetor = InputHandlerQ2.lerVetor(sc, tamanho);
		
		ViewVectQ2.mostarVect(vetor,tamanho);
		
		double soma = VetorCalculatorQ2.SomaVetor(vetor);
		double media = VetorCalculatorQ2.MediaVetor(vetor);
		
		ViewVectQ2.mostarSoma_Media(soma, media);
	
		
		sc.close();
	}
}