package udemy_java_2;

import java.util.Locale;
import java.util.Scanner;

public class Cod15_MaiorNúmeroFunção2 {

// ESSE CODIGO NÃO É MEU !! É UMA UMA FORMA MELHORADA
// DA "Aula_20" (Com boas práticas, formas mais corretas de estrutura de software)
	
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Entrada de dados do triângulo Y
        System.out.println("<< Enter the measures of triangle Y >> ");
        Triangulo trianguloY = lerTriangulo(sc);

        // Entrada de dados do triângulo X
        System.out.println("<< Enter the measures of triangle X >> ");
        Triangulo trianguloX = lerTriangulo(sc);

        // Cálculo das áreas
        double areaY = trianguloY.calcularArea();
        double areaX = trianguloX.calcularArea();

        // Exibição dos resultados
        System.out.printf("Triangle Y area: %.5f%n", areaY);
        System.out.printf("Triangle X area: %.5f%n", areaX);

        // Comparação das áreas
        System.out.println("Larger = " + (areaX > areaY ? "X" : "Y"));

        sc.close();
    }

    // Método para ler um triângulo do usuário
    public static Triangulo lerTriangulo(Scanner sc) {
        System.out.print("Digite o lado 1 do triângulo: ");
        double lado1 = sc.nextDouble();
        System.out.print("Digite o lado 2 do triângulo: ");
        double lado2 = sc.nextDouble();
        System.out.print("Digite o lado 3 do triângulo: ");
        double lado3 = sc.nextDouble();
        
        return new Triangulo(lado1, lado2, lado3);
    }
}

// Classe para representar um triângulo e encapsular seus cálculos
class Triangulo {
    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularSemiperimetro() {
        return (lado1 + lado2 + lado3) / 2;
    }

    public double calcularArea() {
        double p = calcularSemiperimetro();
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }
}
