package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaffPage extends BasicPage {

	public StaffPage(WebDriver driver) {
		super(driver);
	}
	
	private By addstaff = By.cssSelector("button#act_primary");
	private By name1 = By.id("_asf1");
	private By surname1 = By.id("_asl1");
	private By mail1 = By.id("_ase1");
	private By name2 = By.id("_asf2");
	private By surname2 = By.id("_asl2");
	private By mail2 = By.id("_ase2");
	private By save = By.id("_as_save_multiple");
	
	public WebElement getAddstaff() {
		return this.driver.findElement(addstaff);
	}
	public WebElement getName1() {
		return this.driver.findElement(name1);
	}
	public WebElement getSurname1() {
		return this.driver.findElement(surname1);
	}
	public WebElement getMail1() {
		return this.driver.findElement(mail1);
	}
	public WebElement getName2() {
		return this.driver.findElement(name2);
	}
	public WebElement getSurname2() {
		return this.driver.findElement(surname2);
	}
	public WebElement getMail2() {
		return this.driver.findElement(mail2);
	}
	public WebElement getSave() {
		return this.driver.findElement(save);
	}
	public void button () {
		WebElement klikni = this.getAddstaff();
		klikni.click();
	}
	public void Add1() {
		WebElement ime = this.getName1();
		ime.sendKeys("Neko");
		WebElement prezime = this.getSurname1();
		prezime.sendKeys("prezime");
		WebElement mejl = this.getMail1();
		mejl.sendKeys("nekoinesto@gywg.com");
	}
	public void Add2() {
		WebElement ime = this.getName2();
		ime.sendKeys("Neko");
		WebElement prezime = this.getSurname2();
		prezime.sendKeys("prezime");
		WebElement mejl = this.getMail2();
		mejl.sendKeys("nekoneko2@gywg.com");
	}
	public void save() {
		WebElement save = this.getSave();
		save.click();
	}


}
