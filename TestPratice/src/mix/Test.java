package mix;

import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("THis is Simple Git Demmo");
		
		   SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy/HH/mm/ss/a");  
		   Date date = new Date();  
		   String path = System.getProperty("user.dir") + "\\abc";
		   File file = new File(path);
		   
		   if(!file.isDirectory() && file.exists()) {
			   
			   System.out.println("directory");
			   System.out.println("call Screenshots method");
		   }
		   else
		   {
			   System.out.println("Not");
			   file.mkdirs();
			   System.out.println("created");
		   }
		   
	}

}
