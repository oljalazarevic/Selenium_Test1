package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff extends BasicPage{

	public HumanityEditStaff(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	private By nickname = By.name("nick_name");
	private By buttonSave = By.cssSelector("button#act_primary");
	private By imagesuccessful = By.id("fileupload_completedMessage");
	
	public void setNickname() {
		this.driver.findElement(this.nickname).sendKeys("nickname");
	}
	public void clickOnSave() {
		this.driver.findElement(this.buttonSave).click();
	}
	public void clickOnUpload() {
		WebElement uploadPicture = driver.findElement(By.id("fileupload"));
		uploadPicture.sendKeys("C:\\Users\\m\\Desktop\\pexels-photo-1820567.jpeg");
	}
	public boolean imagesuccessful() {
		try {
			return this.driver.findElement(imagesuccessful) != null;
		} 
		catch (Exception e) {		
			return false;
		}
		
	}

}
