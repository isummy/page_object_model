package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {
	
	WebDriver driver;
	
	By RegLink = By.xpath("//a[contains(text(),'REGISTER')]");
	By  FirstName= By.xpath("//tbody/tr[2]/td[2]/input[1]");
	By  LastName= By.xpath("//tbody/tr[3]/td[2]/input[1]");
	By  Phone= By.xpath("//tbody/tr[4]/td[2]/input[1]");
	By Email= By.xpath("//input[@id='userName']");
	By Address = By.xpath("//tbody/tr[7]/td[2]/input[1]");
	By City = By.name("city");
	By State = By.name("state");
	By postalcode = By.name("postalCode");
	By Country = By.name("country");
	By Username = By.name("email");
	By Password = By.name("password");
	By Confirmpswd = By.name("confirmPassword");
	By Submit = By.name("submit");

	
	Register (WebDriver d) {
		driver = d;
	}
	public void clickreglink() {
		driver.findElement(RegLink).click();
		
		
	}
	public void setfirstname(String fname) {
		driver.findElement(FirstName).sendKeys(fname);
		
	}
	public void setlastname(String lname) {
		driver.findElement(LastName).sendKeys(lname);
		
	}
	public void setphoneno(String phn) {
		driver.findElement(Phone).sendKeys(phn);
	}
	public void setemail(String email) {
		driver.findElement(Email).sendKeys(email);
	}
	
	public void setaddress(String address) {
		driver.findElement(Address).sendKeys(address);
	}
	public void setcity(String city) {
		driver.findElement(City).sendKeys(city);
	}
	public void setstate(String state) {
		driver.findElement(State).sendKeys(state);
	}
	public void setpincode(String code) {
		driver.findElement(postalcode).sendKeys(code);
	}
	public void selectcountry(String country){
	Select ind=new Select(driver.findElement(Country));
	ind.selectByValue("INDIA")	;
		
	}
	
	public void setusername(String user) {
		driver.findElement(Username).sendKeys(user);
	}
	public void setpswd(String pswd) {
		driver.findElement(Password).sendKeys(pswd);
	}
	 public void confirmpswd(String confimpswd) {
		driver.findElement(Confirmpswd).sendKeys(confimpswd);
	}
	
	 public void clicksubmit() {
		driver.findElement(Submit).click();
	}
	
	}
