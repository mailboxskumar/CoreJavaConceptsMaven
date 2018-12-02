package javaprograming.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConceptsProperties {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		new ConceptsProperties().getProperty("URL");
	}
		
	public String getProperty(String key) throws IOException,FileNotFoundException {

		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("\\enter properties file path");
		prop.load(file);
		return prop.getProperty(key);
	}
	

}
