import java.util.ArrayList;
import java.util.Arrays;

import com.fasterxml.jackson.databind.JsonNode;

public class JsonUtils {

	public JsonUtils() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public static ArrayList<String> stripArray(JsonNode node) {
		if (node.isArray()) {
			

			System.out.println("This node is an aray of size :" + node.size());
			String bracketStrip = node.toString().replaceAll("\\[|\\]", "");

			return new ArrayList<String>(Arrays.asList(bracketStrip.split(",")));

		} else {
			System.out.println(node + " is not an array");
		}
		return null;
	}
	

}
