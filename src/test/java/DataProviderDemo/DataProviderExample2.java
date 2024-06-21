package DataProviderDemo;

import org.testng.annotations.DataProvider;

public class DataProviderExample2 {
	
	@DataProvider(name="TestData")
	public Object[][] DataMethod(){
		
		return new Object[][] {{"Sadhana234@gmail.com","Password","Invalid"},{"DataProviderDemo@gmail.com","987654321","Valid"}};
	}

}
