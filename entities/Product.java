package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public Product() {
	//A sobre carga do método "Product"
	}
	
	//Os construtores normalmente vem depois dos atributos
	public Product(String name,double price, int quantity) {
		this.name = name; //this refere-se o "nome" para o atributo "name" acima 
		this.price = price;
		this.quantity = quantity;
	}
		// SET > alteração GET > acessado 

// Encapsulamento do "Name"-----------------------------------
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

// Encapsulamento do "Price"-----------------------------------	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

// Encapsulamento do "Quantity"-----------------------------------	
// No caso da quantity vai haver somente o método "getQuantity"
// não há o "setQuantity" para protege-lo de alterações inconsistentes
	
	public int getQuantity() {
		return quantity;
	}
//----------------------------------------------------------------
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
