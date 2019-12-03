package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHomePage extends BasicPage {

	
	private By AboutUs = By.cssSelector("li.nav-item a.nav-link[href^='#']");
	private By Login = By.cssSelector("#navbarSupportedContent > div > a:nth-child(3) > p");
	private By Name = By.name("fullname");
	private By Email = By.name("workemail");
	private By ButtonDown = By.cssSelector("div.input-wrapper #free-trial-link-01");
	private By ButtonUp = By.cssSelector("a[href^='#'].button");
	
	public HumanityHomePage(WebDriver driver) {
		super(driver);
	}
	public WebElement getAboutUs() {
		return this.driver.findElement(AboutUs);
	}
	public WebElement getLogin() {
		return this.driver.findElement(Login);
	}
	public WebElement getName() {
		return this.driver.findElement(Name);
	}
	public WebElement getEmail() {
		return this.driver.findElement(Email);
	}
	public WebElement getButtonDown() {
		return this.driver.findElement(ButtonDown);
	}
	public WebElement getButtonUp() {
		return this.driver.findElement(ButtonUp);
	}
	
	public void SetName() {
		WebElement FullName = this.getName();
		FullName.sendKeys("Oki Laza");
	}
	public void SetMail() {
		WebElement WorkMail = this.getEmail();
		WorkMail.sendKeys("oljaslash@gmail.com");
	}
	public void freeTrial() {
		WebElement Dugmence = this.getButtonDown();
		Dugmence.click();
	}
	public void freeTrialUp() {
		WebElement Dugmence = this.getButtonUp();
		Dugmence.click();
	}
	public void setLogin() {
		WebElement klik = this.getLogin();
		klik.click();
	}
}
