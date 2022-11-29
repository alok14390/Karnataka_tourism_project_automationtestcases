package karnataka_tourism;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase_1 {
	
	
	
	
	public static  String url =	"https://karnatakatourism.org/";
	WebDriver driver ;
	
	
	// initialize the HtmlReporter
		ExtentHtmlReporter htmlReporter;
		//initialize ExtentReports and attach the HtmlReporter
		ExtentReports extent;
		//creating tests
		ExtentTest test;
	
	
	@BeforeTest
	public void bt() throws InterruptedException{
		
		  htmlReporter = new ExtentHtmlReporter("extent.html");
		  extent = new ExtentReports();
		  extent.attachReporter(htmlReporter);
		  WebDriverManager.chromedriver().setup();
		  driver =new ChromeDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
	}
		  
   @Test(enabled=true)
   public void test() 
   {
	   test = extent.createTest("MyFirstTest");
	   driver.findElement(By.linkText("Experience")).click();
	   test.pass("user navigate to Experience page");
	   driver.findElement(By.xpath("//*[@href='https://karnatakatourism.org/tour-item/tranquility/']")).click();
	   test.info("User is in tranquility page");
	   
   }
   
   
   
   @Test(enabled=true)
   public void test1() 
   {
	   
	   driver.findElement(By.linkText("Experience")).click();
	   driver.findElement(By.xpath("//*[@href='https://karnatakatourism.org/tour-item/tranquility/']")).click();
	   Actions act= new Actions(driver);
	   act.moveToElement(driver.findElement(By.xpath("//*[@class='mkdf-tours-gallery-simple-item-link']")));
	   WebElement ele1= driver.findElement(By.xpath("//*[@class='mkdf-tours-gallery-simple-item-link']"));
	   act.click(ele1).build().perform();
	  
	   
	   
   }
   
   
   @Test(enabled=true)
   public void test2() 
   {
	   
	   driver.findElement(By.linkText("Experience")).click();
	   driver.findElement(By.xpath("//*[@href='https://karnatakatourism.org/tour-item/spirituality/']")).click();
	   
	   
   }
   
   
   @Test(enabled=true)
   public void test3() 
   {
	   
	   driver.findElement(By.linkText("Experience")).click();
	   driver.findElement(By.xpath("//*[@href='https://karnatakatourism.org/tour-item/spirituality/']")).click();
//	   Actions act= new Actions(driver);
//	   act.moveToElement(driver.findElement(By.xpath("//*[@href='#tab-temples-843']")));
//	   WebElement ele1= driver.findElement(By.xpath("//*[@href='#tab-temples-843']"));
//	   act.click(ele1).build().perform();
	   Actions act1= new Actions(driver);
	   act1.moveToElement(driver.findElement(By.xpath("//*[@href='https://karnatakatourism.org/tour-item/sri-manjunatha-temple-dharmasthala/']")));
	   WebElement ele2= driver.findElement(By.xpath("//*[@href='https://karnatakatourism.org/tour-item/sri-manjunatha-temple-dharmasthala/']"));
	   act1.click(ele2).build().perform();
	   
   }
   
   @Test(enabled=true)
   public void test4() 
   {
	   
	   driver.findElement(By.linkText("Experience")).click();
	   driver.findElement(By.xpath("//*[@href='https://karnatakatourism.org/tour-item/festivals/']")).click();
	   
	   
   }
   
  
   
   
   
   @AfterTest
   public void at()
   {
	   
	   driver.close();
	   extent.flush();
   }
}
		  


