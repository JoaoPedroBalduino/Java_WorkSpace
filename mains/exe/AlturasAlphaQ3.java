package mains.exe;
import java.util.Scanner;

public class AlturasAlphaQ3 { 
	//DEPOIS QUANDO POSSIVEL APLICAR O SRP

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int tamanhoVetor, nmenores;
		double alturatotal, alturamedia, percentualMenores;
		
		System.out.print("Digite o tamanho do vetor: ");
		tamanhoVetor = sc.nextInt();
		System.out.println( );
		
		String[] nomes = new String[tamanhoVetor];
		int[] idades = new int[tamanhoVetor];
		double[] alturas =new double[tamanhoVetor];
		
		for(int i=0;i<tamanhoVetor;i++) { 
			
			System.out.println("Dados da pessoa " + (i + 1) + ":");

		    sc.nextLine(); // Limpa o \n que sobrou do nextDouble anterior (se for o primeiro, pode ser ignorado)

		    System.out.print("Nome: ");
		    nomes[i] = sc.nextLine(); // Lê uma linha completa (nome)

		    System.out.print("Idade: ");
		    idades[i] = sc.nextInt(); // Lê um número inteiro

		    System.out.print("Altura: ");
		    alturas[i] = sc.nextDouble(); // Lê um número com ponto

		    // Limpar de novo o \n se depois for usar nextLine
		    // sc.nextLine(); ← 
		}
///
			nmenores=0;
			alturatotal=0;
		for(int i=0;i<tamanhoVetor;i++) {//outra forma -> " ... ;i<idade.length; ... "
			if(idades[i]<16) {
				nmenores++; //nmenores + 1 
			}
			alturatotal+=alturas[i]; 
			//alturatotal = alturatotal + alturas[i]
			// X = X + o valor da variavel que for menor que 16
		}
		
		alturamedia = alturatotal/tamanhoVetor;
		// 0 = X(soma das idades menores que 16)/TamanhoVetor(Quantidade de idades)
		
		//O "(double)" antes da variavel 
		percentualMenores = ((double)nmenores/tamanhoVetor)*100.00;
		// 0 = amostra/população*100.00
		
		// \n para deixar uma linha em branco antes do "System.out" 
		System.out.printf("\nAltura media = %.2f\n",alturamedia);// 2 casa decimais 
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",percentualMenores);// 1 casa decimal 
			
		for(int i=0;i<tamanhoVetor;i++) {
			if (idades[i] < 16) {
				System.out.printf("%s\n", nomes[i]);
				//Para que os numero sejam escritos um apos o outro 
				/*--console--
				 * Maria
				 * João
				 * ---------
				 * */
			}
		}
		
	sc.close();
	}

}