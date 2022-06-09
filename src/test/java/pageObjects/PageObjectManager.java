package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	WebDriver driver;
	LoginFormpage login;
	productspage productpage;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;}
	
	
	public LoginFormpage login(WebDriver driver) {
		return login=new LoginFormpage(driver);}
	
	public productspage productpage(WebDriver driver) {
		return productpage=new productspage(driver);
	}

}
