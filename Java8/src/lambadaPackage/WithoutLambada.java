package lambadaPackage;

public class WithoutLambada {

	public static void main(String[] args) {
		
		//Anonymous Class
				HelloLambda helloLambda=new HelloLambda() {
					
					@Override
					public void sayHello() {
						System.out.println("Hello World");
					}
				};
				
				helloLambda.sayHello();

	}

}
