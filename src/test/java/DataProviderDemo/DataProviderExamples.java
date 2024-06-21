package DataProviderDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExamples {
	
	@DataProvider(name="DataProvider_TestData")
	public Object[][] DataMethod(){
		
		return new Object[][] {{"value1"},{"TestTwo"}};
	}
	
	@Test(dataProvider="TestData",dataProviderClass=DataProviderExample2.class)
	public void testcaseDemo(String Username,String Pwd,String Status) {
		
		System.out.println("Passing username and passwoed details ");		
		System.out.println("Username : "+Username);
		System.out.println("Password : "+Pwd);
		System.out.println("Status : "+Status);
		
	}

}
