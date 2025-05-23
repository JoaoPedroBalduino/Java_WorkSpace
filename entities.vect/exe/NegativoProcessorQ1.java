package entities.exe;

public class NegativoProcessorQ1 {
	
	public static void mostrarNegativo (int[] vetor) {
		System.out.println("\nNÚMEROS NEGATIVOS: ");
		for (int num : vetor) {
			if (num < 0) {
				System.out.println(num);
			}
		}
	}
}