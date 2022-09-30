package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	private static Properties prop = new Properties();

	public static String getConfigProperties(String key) {		
		String value = null;
		try {
			prop.load(new FileInputStream("./Config.properties"));
			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		return value;
	}

	public static String getObjectRepositoryProp(String pageName, String key) {		
		String value = null;
		try {
			prop.load(new FileInputStream("./ObjectRepositories/"+pageName+".properties"));
			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		return value;
	}

}