package java_functions;

import java.util.Scanner;

public class Cod19_Retangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a largura do rétangulo?: ");
		double largura = sc.nextDouble();
		
		System.out.println("Qual a altura do rétangulo?: ");
		double altura = sc.nextDouble();
		
		System.out.println("Largura = "+largura);
		System.out.println("Altura = "+altura);

		double area = Area(largura, altura);
		showArea(area);
		
		double perimetro = Perimetro(largura, altura);
		showPerimetro(perimetro);
		
		double diagonal = Diagonal(largura, altura);
		showDiagonal(diagonal);

		sc.close();
		}

	public static double Area(double b,double h) {
		return  b * h; 
	}
	public static void showArea(double value) {
		System.out.println("Area = "+ value);
	}
	
	public static double Perimetro(double b,double h) {
		return 2*(b + h); 
	}
	public static void showPerimetro(double value) {
		System.out.println("Perimetro = "+ value);
	}
	
	public static double Diagonal(double b,double h) {
		return Math.sqrt(Math.pow(b, 2) + Math.pow(h, 2)); 
	}
	public static void showDiagonal(double value) {
		System.out.printf("Diagonal = %.2f%n", value);
	}			// format para deixar com 2 casas decimais
	
}
