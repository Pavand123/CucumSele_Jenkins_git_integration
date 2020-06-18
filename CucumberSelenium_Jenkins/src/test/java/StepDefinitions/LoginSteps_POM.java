package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_o_model.LoginPage;
import io.cucumber.java.en.*;


public class LoginSteps_POM {

	/*public WebDriver driver=null;
	public LoginPage login=null;
	
	@Given("Browser is open")
	public void browser_is_open() {
	 
		String Projpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Projpath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	   
		driver.navigate().to("https://example.testproject.io/web/");
				
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_Username_and_Password(String username, String password) throws InterruptedException {
	   
		login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		//Thread.sleep(500);
		
	}

	@And("user clicks login")
	public void user_clicks_login() throws InterruptedException {
		//login=new LoginPage(driver);
		login.clickonLogin();
		
	}

	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() throws InterruptedException {
	    
		login.checklogoutisDisplayed();
		
	}
	@And("clickonLogout")
	public void clickonLogout() {
	
	    login.clickonLogout();
    }

	@And("browser is closed")
	public void browser_is_closed() {
		
		driver.close();
		driver.quit();
	}
*/
}
