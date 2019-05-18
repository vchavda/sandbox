import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class PersonMatchReader {

	static JsonNode root;

	public static void main(String[] args) throws JsonProcessingException, IOException {
		
		String bob = "one.two.three.four";
		
		String[] pop = bob.split("[.]");
		
		System.out.println(pop.length);
		
		switch (pop.length)
		{
			case 1: 
				System.out.println(pop[0]);
			case 4:
				System.out.println("four");
		}
		
		ObjectMapper mapper = new ObjectMapper();	

		File file = (new File(PersonConstants.API_RESPONSE));
		String str = FileUtils.readFileToString(file);
		System.out.println(str.substring(5, str.length()-1));
		
		//root = mapper.readTree(new File(PersonConstants.API_RESPONSE));
		root = mapper.readTree(str.substring(5, str.length()-1));
		System.out.println("Root : " + root);

		// Get latestPersonId
		JsonNode latestPersonId = getNode(PersonConstants.LATEST_PERSON_ID);
		System.out.println(latestPersonId == null ? "" : latestPersonId.asText());
		
		// get personIds
		ArrayList<String> items = getNodeAsArrayOfStrings(PersonConstants.PERSON_IDS);
		
		//testing looping of items
		String val = "200, 300, 399";
		String[] values = val.split(",");
		
		for (String x : values)
		{
			items.contains(x.trim());
			System.out.println(x.trim());
		}
	
		
		//System.out.println(items == null ? "" : items.get(0));
		System.out.println(items == null ? "" : items.toString());

		// synopsis
		JsonNode synopsisNode = root.path(PersonConstants.SYNOPSIS);
		if (!synopsisNode.isMissingNode()) {

			if (synopsisNode.isArray()) {
				for (JsonNode node : synopsisNode) {
					String shoeSize = node.path("shoeSize").asText();
					String eyeColourRight = node.path("eyeColourRight").asText();
					System.out.println("type : " + shoeSize);
					System.out.println("ref : " + eyeColourRight);

				}
			} else {
				System.out.println("not an array");
				System.out.println(synopsisNode.path(PersonConstants.SHOE_SIZE).asText());
				System.out.println(synopsisNode.path(PersonConstants.EYE_COLOUR_RIGHT).asText());
			}
		} else {
			System.out.println(PersonConstants.SYNOPSIS + PersonConstants.MISSING);
		}

		// matchGroupId
		JsonNode matchGroupId = getNode(PersonConstants.MATCHGROUPID);
		System.out.println(matchGroupId == null ? "" : matchGroupId.asText());


		// matchGroupCreateDate
		JsonNode matchGroupCreateDate = getNode(PersonConstants.MATCH_GROUP_CREATE_DATE);
		System.out.println(matchGroupCreateDate == null ? "" : matchGroupCreateDate.asText());


	}

	// generic methods //

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

	private static ArrayList<String> getNodeAsArrayOfStrings(String node) {
		JsonNode jnode = root.path(node);

		if (!jnode.isMissingNode()) {
			return JsonUtils.stripArray(root.path(node));

		} else {
			System.out.println(node + PersonConstants.MISSING);
		}
		return null;
	}

	public static JsonNode getNode(String node) {

		JsonNode jnode = root.path(node);

		if (!jnode.isMissingNode()) {
			return jnode;

		} else {
			System.out.println(node + PersonConstants.MISSING);
		}

		return null;

	}

}
