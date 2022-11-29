package karnataka_tourism;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase_2 {
	
	public static  String url =	"https://karnatakatourism.org/";
	WebDriver driver ;
	
	
	@Before
	public void bt() throws InterruptedException{
		
		
		  WebDriverManager.chromedriver().setup();
		  driver =new ChromeDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
	}
		  
	
	 @Test()
	   public void test1() 
	   {
		   
		   driver.findElement(By.linkText("Experience")).click();
		   driver.findElement(By.xpath("//*[@href='https://karnatakatourism.org/tour-item/festivals/']")).click();
		   Actions act= new Actions(driver);
		   act.moveToElement(driver.findElement(By.xpath("//*[@href='#tab-general-karnataka-106']")));
		   WebElement ele1= driver.findElement(By.xpath("//*[@href='#tab-general-karnataka-106']"));
		   act.click(ele1).build().perform();
		   
	   }
	   
	   
	   @Test()
	   public void test2() 
	   {
		   
		   driver.findElement(By.linkText("Experience")).click();
		   driver.findElement(By.xpath("//*[@href='https://karnatakatourism.org/tour-item/wildlife/']")).click();
		  
		   
	   }
	   
	  
	   
	   
	   
	   
	   @Test()
	   public void test3()  
	   {
		   
		   driver.findElement(By.linkText("Experience")).click();
		   driver.findElement(By.xpath("//*[@href='https://karnatakatourism.org/tour-item/grandeur/']")).click();
		   
		  
	   }
	   
	   
	 
	   
	   
	   @Test()
	   public void test4() throws InterruptedException 
	   {
		   
		   driver.findElement(By.linkText("Experience")).click();
		   driver.findElement(By.xpath("//*[@href='https://karnatakatourism.org/tour-item/cuisines/']")).click();
		   
		  
		  
	   }
	   
	   @Test()
	   public void test5() throws InterruptedException 
	   {
		   
		   driver.findElement(By.linkText("Experience")).click();
		   driver.findElement(By.xpath("//*[@href='https://karnatakatourism.org/tour-item/artforms/']")).click();
		   //Actions act= new Actions(driver);
		   
		   Thread.sleep(2000);
		   Actions act1= new Actions(driver);
		   act1.moveToElement(  driver.findElement(By.xpath("//*[@href='#tab-classical-386']")));
		   WebElement ele2= driver.findElement(By.xpath("//*[@href='#tab-classical-386']"));
		   act1.click(ele2).build().perform();
		  
		  
	   }
	   
	   @After
	   public void at()
	   {
		   
		   driver.close();
	   }
	

}
