package File;

import java.io.FileInputStream;
import java.util.Properties;

public class readingProperty {

	public static void main(String[] args) {
		// this is now asking in interview.
		// this will be your bread and butter in your project
		// property file-->.properties --> we will be using set of key value files
		// when ever you are coding.args you should not hard code any values.
		// because-> where ever you have consumed everywhere you have to change
		// security
	    String sPath1 =" C:\\Users\\chapa004\\Documents\\Indu\\Workspaces\\Eclipse\\JavaTraining\\FileHandling/testdata.properties";
		//String sPath1 = System.getProperty("user.dir")+"/testdata.properties";
	try	
	{
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream(sPath1);
		prop.load(fi);
		System.getProperties().putAll(prop);
		System.out.println("Property value of username"+System.getProperty("username"));
		System.out.println("Property value of username"+System.getProperty("password"));
		System.out.println("Property value of username"+System.getProperty("browser"));
		System.setProperty("hi","Hello");
		System.out.println(System.getProperty("os.name"));  // windows version print
		System.out.println(System.getProperty("user.dir")); // print the path
		}
	catch(Exception a)
	{
		System.out.println(a);
	}
	

	}

}
