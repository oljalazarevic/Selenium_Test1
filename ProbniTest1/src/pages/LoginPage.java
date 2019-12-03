package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasicPage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	private By Username = By.id("email");
	private By Password = By.id("password");
	private By ButtonLog = By.cssSelector("button.btn");
	
	public WebElement getUsername() {
		return this.driver.findElement(Username);
	}
	public WebElement getPassword() {
		return this.driver.findElement(Password);
	}
	public WebElement getButtonLog() {
		return this.driver.findElement(ButtonLog);
	}
	
	public void log () throws InterruptedException {
		WebElement ime = this.getUsername();
		ime.sendKeys("fajam13252@xmail2.net");
		Thread.sleep(2000);
		WebElement sifra = this.getPassword();
		sifra.sendKeys("statebriga");
		Thread.sleep(2000);
		WebElement dugme = this.getButtonLog();
		dugme.click();
	}

}
