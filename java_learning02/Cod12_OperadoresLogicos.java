package java_learning02;

import java.util.Locale;

public class Cod12_OperadoresLogicos {
//
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		// 0101 1001|		&: 0001 1000 (24)
		//			|--> 	|: 0111 1101 (125)
		// 0011 1100|		^: 0110 0101 (101)
	}

}
