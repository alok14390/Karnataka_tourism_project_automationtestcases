package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class definition {
	
	public static  String url =	"https://karnatakatourism.org/";
	WebDriver driver ;
	
	
	@Given("User should be in home page of karnataka tourism website")
	public void user_should_be_in_home_page_of_karnataka_tourism_website() {
		WebDriverManager.chromedriver().setup();
		  driver =new ChromeDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
	}
	@When("Click on search option")
	public void click_on_search_option() {
		driver.findElement(By.xpath("//*[@class='mkdf-search-opener-wrapper']")).click();
	}
	@And("Enter data {string}")
	public void enter_data(String string) {
		driver.findElement(By.xpath("//*[@class='mkdf-search-field']")).sendKeys(string);
	}
	@And("Click enter")
	public void click_enter() {
		 driver.findElement(By.xpath("//*[@class='mkdf-icon-font-elegant icon_search ']")).click();
	    
	}
	@Then("User should see url as {string}")
	public void user_should_see_url_as(String string) {
		String k= driver.getCurrentUrl();
		  Assert.assertEquals(string,k);
		  driver.close();
	}
	
	

}
