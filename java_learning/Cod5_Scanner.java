package java_learning;
import java.util.Scanner;
import java.util.Locale;

public class Cod5_Scanner {

	public static void main(String[] args) {
	//Entrada de dados em Java
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int y;
		y = sc.nextInt();
		
		String x;
		x = sc.next();
		
		Double z;
		z = sc.nextDouble();
		
		char a;
		a = sc.next().charAt(0);//"charAt(0)" vai pegar a primeira letra do que for digitado		
		
		System.out.println("Int: " + x);
		System.out.println("String: " + y);
		System.out.println("Double:" + z);
		System.out.println("char: " + a);
		//"sysout" + ctrl + space
		
		sc.close();
	
	}

}
