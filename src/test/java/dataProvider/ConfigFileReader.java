package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	private static Properties prop;
	private final String propertyFilePath= "PropertyFile\\LumenProperty.properties";
	 
	 
	 public ConfigFileReader(){
	 BufferedReader reader;
	 try {
	 reader = new BufferedReader(new FileReader(propertyFilePath));
	 prop = new Properties();
	 try {
	 prop.load(reader);
	 reader.close();
	 } catch (IOException e) {
	 e.printStackTrace();
	 }
	 } catch (FileNotFoundException e) {
	 e.printStackTrace();
	 throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
	 } 
	 }
	 
	 public String getDriverPath(){
	 String driverPath = prop.getProperty("driverPath");
	 if(driverPath!= null) return driverPath;
	 else throw new RuntimeException("driverPath not specified in the Configuration.properties file."); 
	 }
		 
	 public String getApplicationUrl() {
	 String url = prop.getProperty("url");
	 if(url != null) return url;
	 else throw new RuntimeException("url not specified in the Configuration.properties file.");
	 }
	 
	 public static String getFirstName() {
		 
		String FirstName = prop.getProperty("FirstName");
		return FirstName;
		 
	 }
		 
	 public static String getLastName() {
		 
			String LastName = prop.getProperty("LastName");
			return LastName;
			 
	 }	
	 
	 public static String getEmail() {
		 
			String Email = prop.getProperty("Email");
			return Email;
			 
	 }	
	 
	 public static String getConfirmEmail() {
		 
			String ConfirmEmail = prop.getProperty("confirmEmail");
			return ConfirmEmail;
			 
	 }	
	 
	 public static String getPassword() {
		 
			String password = prop.getProperty("password");
			return password;
			 
	 }	
	 
	 public static String getConfirmpassword() {
		 
			String Confirmpassword = prop.getProperty("confirmPassword");
			return Confirmpassword;
			 
	 }	


}
