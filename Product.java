// This is a simple Java program that defines a Product class with three attributes: id, name, and price.
// It creates two instances of the Product class, sets their attributes, and prints them to the console.

public class Product {
	int id;
	String name;
	int price;
	
	public static void main(String args[]) {
		Product p=new Product();
		p.id=1;
		p.name="Hajeera";
		p.price=1000;
		
		Product p1=new Product();
		p1.id=2;
		p1.name="Syed";
		p1.price=2000;
		
		System.out.println("ID: "+p.id);
		System.out.println("Name: "+p.name);
		System.out.println("Price: "+p.price);
		System.out.println("ID: "+p1.id);
		System.out.println("Name: "+p1.name);
		System.out.println("Price: "+p1.price);
		
		
	}

}
