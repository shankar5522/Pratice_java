package mix;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class DeleteFolder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//C:\Users\shankarl\git\Test---Demo\Test---demo
		
		String path = System.getProperty("user.dir") + "\\screenshots\\";
		
		File index = new File(path);
		if (!index.exists()) {
		    index.mkdir();
		    System.out.println("Created");
		} else {
		    index.delete();
		    System.out.println("Deleted");
		    /*if (!index.exists()) {
		        index.mkdir();
		    }*/
		}
		
		FileUtils.deleteDirectory(new File(path));
		
		
	}

}
