package testCases;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class EnvironmentWriter {
	public static void createEnvironmentFile() throws Exception {

        File dir = new File("allure-results");
        
        if(!dir.exists()) {
        	dir.mkdir();
        }
		
		Properties properties = new Properties();

        properties.setProperty("Browser", "Chrome");
        properties.setProperty("OS", System.getProperty("os.name"));
        properties.setProperty("Java", System.getProperty("java.version"));
        properties.setProperty("Environment", "QA");

        FileOutputStream fos = new FileOutputStream(new File(dir, "environment.properties"));

        properties.store(fos, "Environment Details");
        fos.close();
    }
}