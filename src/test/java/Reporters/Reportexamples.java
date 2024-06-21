package Reporters;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Reportexamples {
	@Test
	public void reporters() {
		
		Reporter.log("Setting up the brower and managing the exe file",true);
		WebDriverManager.chromedriver().setup();
		
		Reporter.log("Launching Browser \n");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		Reporter.log("current page title is : "+title,false);
		
		driver.quit();
		
	}

}
