import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReader {

	public static void main(String[] args) throws JsonProcessingException, IOException {

		long id;
		String firstName = "";
		String middleName = "";
		String lastName = "";
		String arraynameString = "";
		List<String> favoriteSports;
		List<Gender> gender;

		ObjectMapper mapper = new ObjectMapper();

		// convert Json string to an object/////////////////////////////////////////////////////////
		JsonNode root = mapper.readTree(new File("c:\\Json\\myJson.json"));
		JsonClass jsonclass = mapper.readValue(new File("c:\\Json\\mySimpleJson.json"), JsonClass.class);
		// id
		System.out.println("POJO: Id = " + jsonclass.getId());
		// favourie sports
		favoriteSports = jsonclass.getFavoriteSports();

		if (favoriteSports != null) {
			System.out.println("POJO: favoutiteSport" + favoriteSports.get(1));
		}
		// Gender
		gender = jsonclass.getGender();
		for (Gender gen : gender) {
			System.out.println("POJO : genda " + gen.getId());
		}

		//////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("Root : " + root);

		// Get id
		id = root.path("id").asLong();
		System.out.println("id : " + id);

		// get name
		JsonNode nameNode = root.path("name");
		if (nameNode.isMissingNode()) {
			System.out.println("Name node is missing");

		} else {
			firstName = nameNode.path("first").asText();
			System.out.println("fistname : " + firstName);

			// get familyname:
			JsonNode familynameNode = root.path("name").path("othername");

			System.out.println(familynameNode.get("familyname").asText());

			// contact
			JsonNode contactNode = root.path("contact");
			if (contactNode.isArray()) {
				System.out.println("This Contactnode is an aray");

				for (JsonNode node : contactNode) {
					String type = node.path("type").asText();
					String ref = node.path("ref").asText();
					System.out.println("type : " + type);
					System.out.println("ref : " + ref);

				}
			}

			// arrayname
			JsonNode arrayname = root.path("name").path("othername");
			JsonNode arrayname2 = root.path("name").path("othername").path("arrayname");

			if (arrayname2.isArray()) {
				
				for (JsonNode node : arrayname2) {
					String x = node.asText();
					System.out.println("x : " + x);
				}
				
				System.out.println("This is an array with count :" + arrayname2.size());
				System.out.println(arrayname.get("familyname").toString());
				
				arraynameString = arrayname.get("arrayname").toString();
				String bracketStrip = arraynameString.replaceAll("\\[|\\]", "");

				ArrayList<String> items = new ArrayList<String>(Arrays.asList(bracketStrip.split(",")));
				System.out.println(items.get(2));

			}

			else {
				System.out.println("not an aaray");

			}

		}

	}

}
