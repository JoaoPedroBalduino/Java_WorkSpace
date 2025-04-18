package entities;//Entidade

public class Triangle {

	//Atribrutos
	public double a;
	public double b;
	public double c;

	//Vamos criar um método para calcular a area do triangulo
	//"public"> método pode ser usado em outro arquivo 
	//"double"> tipo do retorno que esse método vai me retornar
	//"area"> nome da operação
	public double area() { // parenteses vazios pq os atributos que vou usar ja estão na classe (a,b,c)
		 double p = (a + b + c)/2.0;
		 double result =  Math.sqrt(p * (p - a) * (p - b) * (p - c));
		 return result;
		 
		 //Outra posibilidade sem o uso da variavel "result"
		 //return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
