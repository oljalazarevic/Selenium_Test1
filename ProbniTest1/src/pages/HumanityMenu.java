package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu extends BasicPage {

	public HumanityMenu(WebDriver driver) {
		super(driver);
	}
	
	private By Dashboard = By.id("sn_dashboard");
	private By Planning = By.id("sn_schedule");
	private By Time = By.id("sn_timeclock");
	private By Requests = By.id("sn_requests");
	private By Traning = By.id("sn_training");
	private By Staff = By.id("sn_staff");
	private By Payroll = By.id("sn_payroll");
	private By Reports = By.id("sn_reports");
	private By Settings = By.cssSelector("#sn_admin > span > i");
	
	public WebElement getDashboard() {
		return this.driver.findElement(Dashboard);
	}
	public WebElement getPlanning() {
		return this.driver.findElement(Planning);
	}
	public WebElement getTime() {
		return this.driver.findElement(Time);
	}
	public WebElement getRequests() {
		return this.driver.findElement(Requests);
	}
	public WebElement getTraning() {
		return this.driver.findElement(Traning);
	}
	public WebElement getStaff() {
		return this.driver.findElement(Staff);
	}
	public WebElement getPayroll() {
		return this.driver.findElement(Payroll);
	}
	public WebElement getReports() {
		return this.driver.findElement(Reports);
	}
	
	public void KlikStaff() {
		WebElement klik = this.getStaff();
		klik.click();
	}
	public void KlikReports() {
		WebElement klik = this.getReports();
		klik.click();
	}
	public void KlikDashboard() {
		WebElement klik = this.getDashboard();
		klik.click();
	}
	public void KlikPayroll() {
		WebElement klik = this.getPayroll();
		klik.click();
	}
	public void KlikPlanning() {
		WebElement klik = this.getPlanning();
		klik.click();
	}
	public void KlikTime() {
		WebElement klik = this.getTime();
		klik.click();
	}
	public void KlikTraning() {
		WebElement klik = this.getTraning();
		klik.click();
	}
	public void KlikRequests() {
		WebElement klik = this.getRequests();
		klik.click();
	}
	public void ClickSettings() {
		this.driver.findElement(this.Settings).click();
	}

}
