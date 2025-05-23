package java_functions;

import java.util.Scanner;

public class Cod18_MaiorNúmero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c); //"max" é a função
		
		showResult(higher);
		
		sc.close();
	}

	//Metodo descobri qual o maior 
	// "int" é o tipo primitivo que a função vai me retornar
	public static int max(int x, int y, int z) { 					
		// "public" > para ser usada em outras classes
		// "static" > para que essa função possa ser chamada independente de se criar um objeto
		
		int aux;//"aux" variavel local (só vai existir na função)	
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;//a função vai retornar "aux"
	}

	//"void" significa que ela não retorna nada.
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
