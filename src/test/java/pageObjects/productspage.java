package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productspage {
public WebDriver driver;
	
	public productspage(WebDriver driver) {
		this.driver=driver;}
	
	
	By products=By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	

	public String txt() {
		
		String txt1="";
		
		txt1=driver.findElement(products).getText();
		return txt1;
	}
}
