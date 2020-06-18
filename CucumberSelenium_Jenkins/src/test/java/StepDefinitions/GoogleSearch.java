package StepDefinitions;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

//import io.cucumber.java.en.*;

public class GoogleSearch {

/*	
	WebDriver driver=null;
	@Given("Browser is open")
	public void browser_is_open() {
	 
		String Projpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Projpath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@And("user is on search page")
	public void user_is_on_search_page() throws InterruptedException {
	   
		driver.navigate().to("https://google.com");
				
	}

	@When("user enters text on search box")
	public void user_enters_text_on_search_box() throws InterruptedException {
	   
		driver.findElement(By.name("q")).sendKeys("AutomationStepbyStep");
		Thread.sleep(1000);
		
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("user should be navigated to searched page")
	public void user_should_be_navigated_to_searched_page() throws InterruptedException {
	    
		driver.findElement(By.linkText("Online Courses")).click();
		Thread.sleep(1000);
		//driver.getPageSource().contains("Online Courses");
		driver.findElement(By.linkText("Selenium Introduction")).click();
		
		driver.close();
		driver.quit();
	}
*/
}
