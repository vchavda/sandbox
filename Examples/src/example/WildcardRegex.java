package example;

public class WildcardRegex {
	public static void main(String[] args)

	{

		String Str = new String("Welcome to Tutorialspoint.com");

		System.out.print("Return Value1 :");
		System.out.println(Str.matches("(.*)Tutorials(.*)"));

		System.out.print("Return Value2 :");
		System.out.println(Str.matches("Tutorials"));

		System.out.print("Return Value3 :");
		System.out.println(Str.matches("Welcome(.*)"));
		
		
		System.out.print("Return Value4 :");
		System.out.println(Str.matches("(.*)Tutorials (.*)"));
		
		System.out.println(wildcardToRegex("He*ll*o"));
		
	}
	
	
	
	
	public static String wildcardToRegex(String wildcardString) {
	    // The 12 is arbitrary, you may adjust it to fit your needs depending
	    // on how many special characters you expect in a single pattern.
	    StringBuilder sb = new StringBuilder(wildcardString.length() + 12);
	    sb.append('^');
	    for (int i = 0; i < wildcardString.length(); ++i) {
	        char c = wildcardString.charAt(i);
	        if (c == '*') {
	            sb.append(".*");
	        } else if (c == '?') {
	            sb.append('.');
	        } else if ("\\.[]{}()+-^$|".indexOf(c) >= 0) {
	            sb.append('\\');
	            sb.append(c);
	        } else {
	            sb.append(c);
	        }
	    }
	    sb.append('$');
	    return sb.toString();
	}

}
