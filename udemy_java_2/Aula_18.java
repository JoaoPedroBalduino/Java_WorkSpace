package udemy_java_2;
import java.util.Locale;

public class Aula_18 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String s = "potato apple lemon orange";
		
		String[] vetor = s.split(" ");
		
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		System.out.println(vetor[3]);

		
	}

}
