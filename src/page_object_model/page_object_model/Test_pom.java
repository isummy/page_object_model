package page_object_model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Test_pom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\suman\\Documents\\Isu Work\\selenium\\browserexe\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=(WebDriver) new ChromeDriver();
	
	Register reg=new Register(driver);
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	
	reg.clickreglink();
	reg.setfirstname("iswarya");
	reg.setlastname("gavarraju");
	reg.setphoneno("9440072456");
	reg.setemail("iswarya.tester@gmail.com");
	reg.setaddress("hyderabad");
	reg.setcity("madhinaguda");
	reg.setstate("telangana");
	reg.setpincode("505000");
	reg.selectcountry("INDIA");
	reg.setusername("iswaryagavarraju");
	reg.setpswd("isu");
	reg.confirmpswd("isu");
	reg.clicksubmit();
	
	if(driver.getPageSource().contains("Thank you for registering. You may now sign-in using the user name and password you've just entered.")) {
		System.out.println("Registration page has been displayed");
	}
	else {
		System.out.println("Registration page is not displayed");
	}
	
	
	
	
	
	
	}
	
	

}
