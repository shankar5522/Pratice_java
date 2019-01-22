package mix;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CheckSamePriorityWithName {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Start");
	}	

	@Test(priority=0)
	public void f1(){
		System.out.println("F1");
	}
	
	@Test(priority=0)
	public void f2(){
		System.out.println("F2");
	}


	@AfterTest
	public void afterTest() {
		System.out.println("End");
	}

}
