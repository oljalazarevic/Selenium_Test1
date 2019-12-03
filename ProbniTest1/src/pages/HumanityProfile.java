package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HumanityProfile extends BasicPage {

	public HumanityProfile(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By profileButton = new By.ById("wrap_us_menu");
	private By profile = By.cssSelector("#userm > div > a:nth-child(3)");
	private By settings = By.cssSelector("#userm > div > a:nth-child(5)");
	private By ava = By.cssSelector("#userm > div > a:nth-child(7)");
	
	
	public void clickOnProfileButton() {
		this.driver.findElement(this.profileButton).click();
	}
	public void clickOnProfile() {
		this.driver.findElement(this.profile).click();
	}
	public void clickOnSettings() {
		this.driver.findElement(this.settings).click();
	}
	public void clickOnAva() {
		this.driver.findElement(this.ava).click();
	}
	

}
