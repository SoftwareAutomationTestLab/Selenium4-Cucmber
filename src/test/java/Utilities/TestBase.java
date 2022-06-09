package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver webmanager() throws IOException {

		FileInputStream fis=new FileInputStream("src/test/resources/Global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		
	String browsername=	prop.getProperty("browser");
		String url=prop.getProperty("testurl");
		
		if(browsername.equalsIgnoreCase("chrome")){
		
		if(driver==null ) {
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.get(url);}
		}
		return driver;
		
	} 
 
}
