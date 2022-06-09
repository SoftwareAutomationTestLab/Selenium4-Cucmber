package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormpage{
	public WebDriver driver;
	
	public LoginFormpage(WebDriver driver) {
		this.driver=driver;}
	
	
	By username=By.xpath("//*[@id=\"user-name\"]");
	By password=By.xpath("//*[@id=\"password\"]");
	By submit=(By.xpath("//*[@id=\"login-button\"]"));
	
	
	public void entertxt(String uname,String pwd){ 
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);}
	
	public void submitform(){
		driver.findElement(submit).click();}
}
