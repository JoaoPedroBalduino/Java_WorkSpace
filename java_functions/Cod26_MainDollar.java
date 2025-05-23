package java_functions;
import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyConverter;

public class Cod26_MainDollar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
		System.out.print("What is the dollar price? > ");
		double counting = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? > ");
		double amount = sc.nextDouble();
		
		double converter = CurrencyConverter.converter(counting,amount);
		
		System.out.println( );
		System.out.println("With the addition of 6% taxes...");
		System.out.printf("Amount to be paid in reais = %.2f",converter);
	
		
		sc.close();
	}

}
