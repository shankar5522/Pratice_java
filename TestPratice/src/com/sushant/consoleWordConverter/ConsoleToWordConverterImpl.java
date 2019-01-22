package com.sushant.consoleWordConverter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*import org.apache.commons.io.output.TeeOutputStream;*/
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class ConsoleToWordConverterImpl {

	static File fileObj = null;
	static FileOutputStream fosObj = null;
	XWPFDocument documentObj = null;
	static PrintStream ps = null;
	String filePath;

	public static void set(String filePath) throws FileNotFoundException {
		fileObj = new File(filePath);
		fosObj = new FileOutputStream(fileObj, true);
		/*
		 * TeeOutputStream tee=new TeeOutputStream(System.err, fosObj); ps = new
		 * PrintStream(tee,true); System.setOut(ps);
		 */

		System.out.println("FileName : " + filePath);
		System.out.println("..................FILE CREATED SUCCESSFULLY...............");
	}

	public void createWord(String filePath) {
		try {
			/*
			 * fileObj = new File(filePath); //Your file fosObj = new
			 * FileOutputStream(fileObj);
			 */
			// documentObj = new XWPFDocument();
			// documentObj.write(fosObj);
			// System.out.println("..................FILE CREATED
			// SUCCESSFULLY...............");
			// documentObj.close();
			fosObj.close();
		} catch (Exception e) {
			System.out.println("Exception in createFile : " + e);
			// e.printStackTrace();
		}
	}

	public void writeFile(String filePath) {
		try {

			if (fileObj.exists()) {
				System.out.println("Already file exist");
				System.out.println("WRITNIGN CONTENT.....");
				System.out.println("BEFORE System.setOut(ps) all gets printed in CONSOLE");
				System.out.println("After System.setOut(ps) all gets printed in word");
				// System.out.println(test1+"\n"+test2+"\n"+test3);
				System.out.println("This goes to out.txt");

				System.out.println("Divide : " + (5 / 0));
				System.out.println("not exe");
				ps.close();
				fosObj.close();

			}
		} catch (Exception e) {

			System.out.println("Exception in WriteFile : " + e);

		}

	}
}
