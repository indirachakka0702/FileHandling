package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;

public class readAndWritetxt {
	
	public static void main(String[] args) 
	{
		// .txt,.doc,.java,.jpg --> kind of file extension .txt-->
		// go to that file path --> open file and start reading --> line be line
		
		String sPath ="C:\\Users\\chapa004\\Documents\\Indu\\Workspaces\\Eclipse\\JavaTraining\\FileHandling\\testWrite.txt ";
		String sPathToWrite ="C:\\Users\\chapa004\\Documents\\Indu\\Workspaces\\Eclipse\\JavaTraining\\FileHandling\\testWrite.txt ";
		//readTextFile(sPath);
		writeTextFile(sPathToWrite);
	    
	}
	private static void writeTextFile(String sPath)
	{
		try {
		FileWriter fw = new FileWriter(sPath,true);
		BufferedWriter br = new BufferedWriter(fw);
		br.write("Hi");
		br.write("\nThis is Indu here");
		br.newLine();
		br.write("I am Happy");
		br.close();
		}catch(Exception a)
		{
			System.out.println(a);
		}
		System.out.println("Success");
	}
	private static void readTextFile(String sPath)
	{
		
	       String sLine;
       try
       {
    	   FileReader fr = new FileReader(sPath);
    	   BufferedReader br = new BufferedReader(fr);
    	   // sLine = br.readLine() ;
    	   while((sLine = br.readLine())!= null)
    	   {
    		   System.out.println(sLine);
    		   if(sLine.contains("Srinidhi"))
    		   {
    			   System.out.println("I Found");
    		   }
    	   }
       
          br.close();
       }catch(Exception a)
       {
    	   System.out.println(a);
       }
	
	}
	// Assignment :: Srinidhi place i want you guys to replace to vinod
  // add int to test and print number only
}

