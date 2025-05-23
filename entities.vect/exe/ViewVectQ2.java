package entities.exe;
//MainSoma_vetor

public class ViewVectQ2 {
	
	public static void mostarVect(double[] vect, int n) {
		System.out.println( );
		System.out.print("VALORES = ");
		
		for(int i=0;i<n;i++) {
			System.out.printf("%.1f ",vect[i]);
		}
	}

	public static void mostarSoma_Media(double media, double soma) {
		System.out.printf("\nSOMA = %.2f\n",soma);
		System.out.printf("MEDIA = %.2f\n",media);
		
	}
}