package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val = "person.names.surname.synonym";
		Integer pos = val.lastIndexOf(".");
		
		System.out.println(val.lastIndexOf("."));
		System.out.println(val.substring(pos+1));
		
		System.out.println(getStringLastText(val, "."));
		
		List<String> mylist = new ArrayList<>();
		mylist.add("suboor");
		mylist.add("suboor1");
		mylist.add("suboor2");
		mylist.add("suboor3");
		System.out.println(Arrays.toString(mylist.toArray()));
		List<String> mylistDistinct = mylist.stream().distinct().collect(Collectors.toList());
		System.out.println(Arrays.toString(mylistDistinct.toArray()));
		List<String> mylist2 = new ArrayList<>();
		mylist.add("suboor");
		mylist.add("suboor1");
		boolean result = mylist2.stream().anyMatch(x -> {
			System.out.println("my inner test");
			boolean ex = mylist.stream().anyMatch(
					
					y -> y.contains(x)
					);
			System.out.println("my inner test"+ex);
			return ex;
		}
		);
		
		System.out.println(result);
		//boolean result2 = Collections.disjoint(mylist, mylist2);
		//System.out.println(result2);

	}
	
	
	public static   String getStringLastText(String text, String delimiter)
	{
		return text.substring(text.lastIndexOf(delimiter)+1);
	}
	
	
	

}
