package tests;




import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.EmployeePage;
import pages.HomePage;
import pages.HumanityEditStaff;
import pages.HumanityMenu;
import pages.HumanityProfile;
import pages.LoginPage;
import pages.LoginPage1;
import pages.TitlePage;

public class LoginTest extends BasicTest {
	private String baseUrl = "https://www.humanity.com/";

	@Test(priority = 0)
	public void basicLogin() throws InterruptedException, FileNotFoundException {
		driver.manage().window().maximize();
		driver.get(baseUrl);
		Thread.sleep(2000);
		
		HomePage hp = new HomePage(driver);
		hp.getLoginBtn().click();
		Thread.sleep(4000);
		
		
		
		LoginPage1 lg = new LoginPage1(driver);
		lg.singIn("fajam13252@xmail2.net", "statebriga");
		Thread.sleep(2000);
		
		TitlePage tp = new TitlePage(driver);
		
		Assert.assertTrue(tp.getPageTitle().contains("Dashboard"));
	}
	
//	@Test(priority = 1)
//	public void dashboardTest() throws InterruptedException {
//		
//		
//		DashboardPage dp = new DashboardPage(driver);
//		System.out.print("dashboardTest" + dp.getNavLinks().size());
//		Assert.assertTrue(dp.getNavLinks().size() > 0);
//	}
	

//	@Test(priority = 2)
//	public void addEmployeeTest() throws InterruptedException {
//		driver.get("https://sdn1.humanity.com/app/dashboard/");
//		Thread.sleep(2000);
//		
//		DashboardPage dp = new DashboardPage(driver);
//		System.out.print("addEmployeeTest" + dp.getNavLinks().size());
//		dp.getNavLinks().get(5).click(); // Staff link
//		Thread.sleep(2000);
//
//		EmployeePage ep = new EmployeePage(driver);
//		ep.getAddEmployeeBtn().click();
//		Thread.sleep(2000);
//		
//		ep.addEmploy("Milan", "Markovic", "3232332@email.com");
//		ep.addEmploy("Darko", "Darkovic", "ewd34334@email.com");
//		ep.addEmploy("Marko", "Jeftic", "092732k32m@email.com");
//		
//		ep.getSaveBtn().click();
//		Thread.sleep(2000);
//	}
//	@Test (priority = 3)
//	public void EditStaffTest() throws InterruptedException {
//		driver.get("https://itbootcamp3.humanity.com/app/dashboard/");
//		Thread.sleep(2000);
//		HumanityProfile hp =  new HumanityProfile(driver);
//		hp.clickOnProfileButton();
//		hp.clickOnSettings();
//		Thread.sleep(2000);
//		
//		HumanityEditStaff hes = new HumanityEditStaff(driver);
//		hes.setNickname();
//		hes.clickOnUpload();
//		hes.imagesuccessful();		
//	}
	@Test(priority = 10)
	public void Settings() throws InterruptedException {
		driver.get("https://sdn1.humanity.com/app/dashboard/");
		Thread.sleep(2000);
		
		HumanityMenu hm = new HumanityMenu(driver);
		hm.ClickSettings();
		
		
	}
}
