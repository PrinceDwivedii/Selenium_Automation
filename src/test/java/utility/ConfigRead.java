package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigRead {

	Properties prop;

	public ConfigRead() throws Exception {

		FileInputStream fis = new FileInputStream("./config/configData.properties");
		//FileInputStream fis = new FileInputStream("./configData.properties");

		prop = new Properties();

		prop.load(fis);

		// prop.getProperty("");

	}

	public String getApplication_QA_URL() {

		String appURL = prop.getProperty("appURL_QA");
		return appURL;

	}

	public String getApplication_Dev_URL() {

		return prop.getProperty("appURL_Dev");
		

	}

	
	public String getUserName() {

		return prop.getProperty("adminUserName");
		

	}
	
	public String getPassword() {

		return prop.getProperty("adminPassword");
		

	}
	
}
