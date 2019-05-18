import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws IOException {
		
		

		Properties prop = new Properties();
		OutputStream output = null;
		InputStream input = null;
		
		try {
			
			// create a properties file, insert items and save it to the root folder
			
			output = new FileOutputStream("config.properties");
			
			// set the properties value
			prop.setProperty("database", "localhost");
			prop.setProperty("user", "bob");
			prop.setProperty("password", "qwerty");
			
			//save properties to root folder
			prop.store(output, null);
			
			
			// read the properties file
			input = new FileInputStream("config.properties");
			prop.load(input);
			
			System.out.println(prop.getProperty("database"));
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("password"));
			
			
			//iterating through the properties file
			Enumeration<?> e = prop.propertyNames();
			while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				String value = prop.getProperty(key);
				System.out.println("key = " + key + " value = " + value);					
			}
			
			
		}
		finally {
			
		}

	}

}
