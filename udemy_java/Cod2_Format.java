package udemy_java;
import java.util.Locale;

public class Cod2_Format {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String nome = "João"; //%s = Texto
		int idade = 22; //%d = Inteiro
		double renda = 4000.0; //%f = Ponto flutuante
		//%n = quebra de linha
		//%c = char
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
