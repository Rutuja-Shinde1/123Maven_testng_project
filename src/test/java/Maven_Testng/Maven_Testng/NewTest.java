package Maven_Testng.Maven_Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	//Maven_Testng.Maven_Testng.NewTest
	
  @Test
  public void f() {
	  System.out.println("This my test area 1 !!!");
	  }
  
  @Test
  public void g() {
	  System.out.println("This my test area 2 !!!");
	  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This my pre-conditions area !!!");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This my post-condition area !!!");
  }

  
  @BeforeMethod
  public void beforemethod() {
	  System.out.println("I need a valid application URL !!!");
  }
  
  @AfterMethod
  public void aftermethod() {
	  System.out.println("Close the application URL !!!");
  }
  
  
}
