package AssertionExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AssertionDemo {
	
	@Test
	public void assertiobnTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String currentTitle=driver.getTitle();
		
		//Assert.assertEquals(currentTitle, "Google","Verifying the page title with actual vs expected");
		
		boolean flag=false;
		if(currentTitle.contains("Goo")) {
			flag=true;
		}
		
		Assert.assertTrue(flag);
		//driver.manage().refresh();
		
		driver.close();
		
	}
	
	
	@Test
	public void assertiobnTest2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String currentTitle=driver.getTitle();
		
		SoftAssert softassertion=new SoftAssert();
		
		softassertion.assertEquals(currentTitle, "google","Verifying the page title with actual vs expected");
		
		boolean flag=false;
		if(currentTitle.contains("Goo")) {
			flag=true;
		}
		
		softassertion.assertTrue(flag);
		
		
		//Assert.assertEquals(currentTitle, "Google","Verifying the page title with actual vs expected");
		
		//driver.manage().refresh();
		
		driver.close();
		
	}
	

}
