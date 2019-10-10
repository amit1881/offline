
package com.prop;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;


public class ResourceHelper {

	public static String getResourcePath(String resource) {
		String path = getBaseResourcePath() + resource;
		return path;
	}
	
	public static String getBaseResourcePath() {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		return path;
	}
	
	public static InputStream getResourcePathInputStream(String path) throws FileNotFoundException{
		//new FileInputStream(ResourceHelper.getResourcePath(path));
		return new FileInputStream(path);
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		getBaseResourcePath() ;
	}
	
	public Properties loadProperties(Properties testProperties, String mappingFileName) {

		try {
			//InputStream stream = this.getClass().getClassLoader().getResourceAsStream(mappingFileName);
			//InputStream stream = ResourceHelper.getResourcePathInputStream("src/test/resources/"+mappingFileName);
			InputStream stream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\"+mappingFileName);
			testProperties.load(stream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testProperties;
	}
	
}
