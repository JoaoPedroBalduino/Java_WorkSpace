package udemy_java_lista;
import java.util.Locale;
import java.util.Scanner;

public class lista_04_Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite um Número:");
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			
			if (i % 2 != 0) {
			System.out.println(i);	
			}
			
		}
		sc.close();
	}

}
