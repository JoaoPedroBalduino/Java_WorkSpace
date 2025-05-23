package java_learning;
import java.util.Locale;

public class Cod1_Format {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double x = 10.35784;
		System.out.print("Original:");
		System.out.println( x);
		
		System.out.print("Formatado para 2 casas:");
		System.out.printf("%.2f%n", x);
		
		System.out.print("Formatado para 4 casas:");
		System.out.printf("%.4f%n", x);
	}

}
