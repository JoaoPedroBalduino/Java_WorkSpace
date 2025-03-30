package udemy_java_2;
import java.util.Scanner;
public class Aula_10_p1 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		
		System.out.print("Digite um valor");
		int valor = sr.nextInt();
		
		switch (valor) {
		case 10:
			valor = (10*2);
			break;
		case 11:
			valor = (11*2);
			break;
		default:
			valor = (000);
			break;
		}
		
		System.out.println("O valor é "+ valor);
		
		sr.close();
		
		
		
		
		
	}

}
