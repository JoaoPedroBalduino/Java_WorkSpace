package java_functions;
import java.util.Locale;
import java.util.Scanner;

public class Cod20_DadosDoFuncionario {
	//JEITO QUE FIZ
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite o nome do funcionário: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o salário bruto do funcionário: ");
		double salarioBruto = sc.nextDouble();
		
		System.out.print("Digite a taxa: ");
		double taxa = sc.nextDouble();
		
		System.out.println( );
		
		System.out.println("Name: "+nome);
		System.out.println("Gross salary: "+salarioBruto);
		System.out.println("Tax: "+ taxa);

		System.out.println( );
		
		double salary_new = newSalary(salarioBruto,taxa);
		showSalary(salary_new);
		
		System.out.print("Which percentage to increase salary? > ");
		double porcentagem = sc.nextDouble();
		
		double percentage_new = newPercentage(salary_new,salarioBruto,porcentagem);
		System.out.println("Updated data: "+ nome +",  $"+ percentage_new);
		
		sc.close();
	}
	
	public static double newSalary(double salarioBruto, double taxa) {
		return salarioBruto - taxa;
	}
	
	public static void showSalary(double value) {
		System.out.println("Employee: "+value);
	}
	
	public static double newPercentage(double salarioLiquido,double salarioBruto, double Porcentagem) {
		return salarioLiquido +(salarioBruto * (Porcentagem / 100));
	} 
	

}