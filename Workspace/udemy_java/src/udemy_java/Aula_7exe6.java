package udemy_java;
import java.util.Locale;
import java.util.Scanner;

public class Aula_7exe6 {
	//Exercício 04 da Lista
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sr = new Scanner(System.in);
		
		System.out.print("Digite o número do funcionario: ");
		int numero = sr.nextInt();
		System.out.print("Digite as horas trabalhadas: ");
		double hora = sr.nextDouble();
		System.out.print("Digite o valor por hora trabalhada: ");
		double valor_hora = sr.nextDouble();
		System.out.println();
		
		double cal = (hora * valor_hora);
		
		System.out.println("O número do funcionario:"+ numero);
		System.out.println("O salario do funcionario é de U$" + cal);
		
		sr.close();
		
		

	}

}
