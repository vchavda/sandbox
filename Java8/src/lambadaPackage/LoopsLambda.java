package lambadaPackage;

import java.util.ArrayList;
import java.util.List;

public class LoopsLambda {

	public static void main(String[] args) {
		
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		//lambda
		//Output : A,B,C,D,E
		items.forEach(item->System.out.println(item));
			 
		
		AddNumbers add = (x,y) -> { //int result = x+y;
		System.out.println(x+y);
		//return result;
		};
		add.addWithVoid(2, 3);
	}
		


}
