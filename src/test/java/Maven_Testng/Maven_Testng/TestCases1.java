package Maven_Testng.Maven_Testng;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestCases1 {
	
	 WebDriver driver=null;
 @Test(groups={"smoke"})
 //(groups={"smoke","functional","regression"})  
   public void TestCases1() {
	  driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
	  WebElement aboutLink= driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='About Selenium']"));
	  aboutLink.click();
	  
	  String title = driver.getTitle();
	  System.out.println("My current page title : "+title);
	  
	  
	 // Assert.assertEquals(title, "About Selenium");
	  
  }
  
  @Test (dependsOnGroups="smoke",groups= {"functional"})
  //(groups= {"smoke","functional"})
  //(dependsOnMethods="TestCases1", groups= {"smoke","functional"})
   public void TestCases2() {
	  
	  WebElement downloadLink= driver.findElement(By.xpath("//a[@href='/downloads']"));
	  downloadLink.click();
	  
	  //driver.findElement(By.xpath("//a[normalize-space()='MVNRepository']")).click();
	  
	  String title1 = driver.getTitle();
	  System.out.println("My current page title : "+title1);
  }
  @Test (dependsOnGroups={"smoke","functional"},groups="regression")
  //(dependsOnMethods="TestCases2",groups="regression")
public void TestCases3() {
	  
	  WebElement documentationLink= driver.findElement(By.xpath("//span[normalize-space()='Documentation']"));
	  documentationLink.click();
	  
	  String title2 = driver.getTitle();
	  System.out.println("My current page title : "+title2);
  }
  
  @BeforeClass(alwaysRun=true)
  public void beforeClass() {
	  
	  System.setProperty("webDriver.chrome,driver", "F:\\Selenium JAR file\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("https://www.selenium.dev/");
	  
	  }

  @AfterClass(alwaysRun=true)
  public void afterClass() {
	  driver.quit();
	  
  }

}
