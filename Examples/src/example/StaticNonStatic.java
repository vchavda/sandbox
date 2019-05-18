package example;

public class StaticNonStatic {
	
	String model;
	int price;
	static int wheels = 4;

	public static void main(String[] args) {
		
		StaticNonStatic c1 = new StaticNonStatic();
		StaticNonStatic c2 = new StaticNonStatic();
		c1.model = "Audi";
		System.out.println(c1.model + " " +  StaticNonStatic.wheels);
		StaticNonStatic.wheels = 8;
		c2.model = "BMW";

		// static methods cannot access non static stuff eg price you will get an error. 
		//System.out.println(c2.model + " " +  StaticNonStatic.wheels + price);
		
	}

	public void start() {
		// non static methods can access static and non-static stuff 
		System.out.println(StaticNonStatic.wheels + price);
	}
	
}
