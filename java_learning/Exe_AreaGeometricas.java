package java_learning;
import java.util.Locale;
import java.util.Scanner;

public class Exe_AreaGeometricas {
	//Exercício 05 da Lista
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sr = new Scanner(System.in);
	
	System.out.print("Digite o valor de A: ");
	double a = sr.nextDouble();
	System.out.print("Digite o valor de B: ");
	double b = sr.nextDouble();
	System.out.print("Digite o valor de C: ");
	double c = sr.nextDouble();
	
	System.out.println();
	
	double area_tri = ((a*c)/2);
	double area_cir = 3.14159 * (Math.pow(c, 2.0));
	double area_tra = ((a+b)*c)/2;
	double area_qua = (Math.pow(b, 2.0));
	double area_ret = (a*b);
	
	System.out.println("TRIANGULO (A e C): "+area_tri);
	System.out.println("CIRCULO (C): "+area_cir);
	System.out.println("TRAPEZIO (A,B,C): "+area_tra);
	System.out.println("QUADRADO (B): "+area_qua);
	System.out.println("RETANGULO (A,B): "+area_ret);
	
	sr.close();
	
	
	
	}

}
