package java_learning;

public class Cod4_printf {

	public static void main(String[] args) {
		// Processamento de dados em Java, Casting
		
		double b,B,h,area;
	
		b = 6;// Se fosse "float" seria "6f"
		B = 8;// "8f"
		h = 5;// "5f"
		
		area = (b + B) / 2.0 * h; //area = (int) (b + B) / 2.0 * h;
		System.out.printf("A area do trapesio é: %.1f",area);
		
		
	}

}
