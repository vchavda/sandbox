package autoUtils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class ReusableSpecifications {
	
		public static RequestSpecBuilder rspec;
		public static RequestSpecification  requestSpecBuilder;
		
		public static RequestSpecification getGenericRequestSpec() {
			
			rspec = new RequestSpecBuilder();
			rspec.setContentType(ContentType.JSON);
			requestSpecBuilder = rspec.build();
			return requestSpecBuilder;
		}
		

}
