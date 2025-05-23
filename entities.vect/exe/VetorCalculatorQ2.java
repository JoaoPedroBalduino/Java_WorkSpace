package entities.exe;
//MainSoma_vetor

public class VetorCalculatorQ2 {

	public static double SomaVetor(double[] vect) {
		double soma = 0;
		for(double ve : vect) {
			soma += ve;
		}
	return soma;
	}

	public static double MediaVetor(double[] vect) {
		if (vect.length == 0) return 0;
		return SomaVetor(vect)/vect.length;
	}

}