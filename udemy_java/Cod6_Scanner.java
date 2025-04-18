package udemy_java;
import java.util.Scanner;

public class Cod6_Scanner {

	public static void main(String[] args) {
		// Entrada de dados em Java-Parte 2
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1,s2,s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();//"nextLine" Permite que a linha 
		s2 = sc.nextLine();//toda seja lida não só a palavra 
		s3 = sc.nextLine();

		System.out.println("*Dados digitados*:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	
		sc.close();
		
		
		//Atenção!! ACESSAR LINK PARA OBSERVAÇÃO
		//blob:https://web.telegram.org/510430c5-9568-4dea-834b-6df205c4c3af
	}


}
