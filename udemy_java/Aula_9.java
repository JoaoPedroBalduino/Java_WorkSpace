package udemy_java;
import java.util.Locale;
import java.util.Scanner;

public class Aula_9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sr = new Scanner(System.in);
		
		System.out.print("Digite o número de minutos: ");
		int minutos_total = sr.nextInt();
		
		double conta = 50;
		
		if (minutos_total > 100) {
			conta = conta + (minutos_total - 100)*2;
			//conta += (minutos_total - 100)*2; outro jeito de fazer 
			System.out.println("O valor total deu R$: "+ conta);
	   }else{
		   System.out.println("O valor total deu R$ 50");
	}
		sr.close();
//Sempre colocar um "()" a mais quando estiver fazerdo calculos em "println"
			
			
			
	}

}
