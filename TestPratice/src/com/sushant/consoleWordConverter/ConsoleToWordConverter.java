package com.sushant.consoleWordConverter;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleToWordConverter {

	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		try
		{
			
			SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmss'.docx'");  
		    Date date = new Date();  
		    String dateFormat=String.valueOf(formatter.format(date));
		
		    String wordName="myDocs_"+dateFormat;
			String path="C:/Users/Shankar/keplerEclipseWorkspace/TestScriptMixeddddddJavaProject/wordOutput/"+wordName;
			ConsoleToWordConverterImpl.set(path);      //after this line whatever compiler will see on console that will come also print on word file
			System.out.println(" MyFileName : "+path);
			
			ConsoleToWordConverterImpl obj=new ConsoleToWordConverterImpl();
			//obj.createWord(path);
			obj.writeFile(path);
			System.out.println("ERROR");
			System.out.println("Creating null pointer Excetion : ");
			//System.out.println("Excetion : "+obj2.getClass());
			String obj1=null;
			System.out.println("Excetion : "+obj1.getClass());
			System.out.println("NOT gets printed");
		}
		catch(Exception e)
		{
			System.out.println("Excetion in MAin Clss : "+e);
			//e.printStackTrace();
		}
		
	}
}
