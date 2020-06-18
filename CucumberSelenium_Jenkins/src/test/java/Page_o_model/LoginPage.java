package Page_o_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	By txt_username = By.id("name");
	By txt_password = By.id("password");
	By btn_click	= By.id("login");
	By btn_logout	= By.id("logout");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public void enterUsername(String username) {
		
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickonLogin() {
		driver.findElement(btn_click).click();
	}
	
	public void checklogoutisDisplayed() {
		driver.findElement(btn_logout).isDisplayed();
		
	}
	
	public void clickonLogout() {
		driver.findElement(btn_logout).click();
	}
}
