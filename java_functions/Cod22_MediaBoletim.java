package java_functions;
import java.util.Scanner;
import entities.CalculoMedia;

public class Cod22_MediaBoletim {
// FIZ DO MEU JEITO 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite o nome do aluno: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite a nota 1º: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a nota 2º: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite a nota 3º: ");
		double nota3 = sc.nextDouble();
		
		System.out.println( );
		
		System.out.println("Nome do aluno: "+ nome);
		
		System.out.println( );
		
		System.out.println("Notas: "+ nota1 + " " + nota2 + " " + nota3);
		
		System.out.println( );
		
		double MediaNotas = CalculoMedia.MediaDasNota(nota1, nota2, nota3);
		showSomaDasNotas(MediaNotas);
		
		System.out.println( );
		
		if (MediaNotas >= 60) {
			System.out.println("Passou! > Parabéns");
		}
		else{
			System.out.println("Não Passou!");
			System.out.println("FALTOU > " + (60-MediaNotas) +" pontos");
		}
		
	sc.close();
	}
	
	public static void showNotas(double MediaNotas) {
		System.out.println("Media da Notas: " + MediaNotas);
	}
	
	public static void showSomaDasNotas(double SNota) {
		System.out.println("Soma das notas: "+ SNota);
	}


}
