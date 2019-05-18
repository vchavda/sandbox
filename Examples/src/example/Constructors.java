package example;

public class Constructors {

	String name;
	int price;
	
	public Constructors() {
		System.out.println("no arg constructor");
	}
	
	public Constructors(String value) {
		name = value;
		System.out.println("value = " + value);
	}

	
	public static void main(String[] args) {

		Constructors c1 = new Constructors();
		c1.price = 100;
		
		Constructors c2 = new Constructors("Audi");
		c2.price = 200;
	}

}
