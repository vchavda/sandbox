package lambadaPackage;

public class WithLambada {

	public static void main(String[] args) {
		
		HelloLambda helloLambada =()->{System.out.println("Hello World 2" );};
		helloLambada.sayHello();

	}

}
