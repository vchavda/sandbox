package example;

public class ReferenceValue {

	int x;
	int y;
		
	public static void main(String[] args) {
		
		ReferenceValue p = new ReferenceValue();
		p.x = 10;
		p.y = 20;
		
		System.out.println(p.x + "  " + p.y);
		swapByValue(p.x, p.y);
		System.out.println(p.x + "  " + p.y);
		swapByRefrence(p);
		System.out.println(p.x + "  " + p.y);
		
	}
	
	public static void swapByValue (int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
	}

	public static void swapByRefrence (ReferenceValue t)
	{
		int temp = t.x;
		t.x = t.y;
		t.y = temp;
		
	}
	
	
}
