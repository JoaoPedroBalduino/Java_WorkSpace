package udemy_java_2;
import java.util.Locale;
import java.util.Scanner;

public class Cod15_MaiorNúmeroFunção {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Digite o número 1: ");
		int a = sc.nextInt();
		System.out.print("Digite o número 2: ");
		int b = sc.nextInt();
		System.out.print("Digite o número 3: ");
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		//max > vai encontrar o maior dos 3 números
		
		showResult(higher);
	
		sc.close();;
	}//Chaves que delimitam a função 
	
	
	//Como a função "max" me retorna um número inteiro colocasse o int 
	//Os nome das variaveis podem ser trocados "a,b,c" >> "x,y,z" respectivamente 
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;//Indicar usando o "return" qual vai ser a saida da função 
	}// fim da função max
	
	public static void showResult(int maior){//quando uma função faz uma ação sem retorna um valor o tipo será vazio
		System.out.println("Higher = "+ maior);
	}
	
}//Chaves que delimitam a classe
