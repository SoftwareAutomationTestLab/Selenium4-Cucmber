package StepDefinitions;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;
import java.util.*;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import Utilities.TestContextSetUp;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginFormpage;

public class loginusingcredentials {

	TestContextSetUp testsetup;
	
	public loginusingcredentials(TestContextSetUp testsetup1) {
		this.testsetup=testsetup1;
		
	}
	
	
	@Given("^website1 is launched$")
	public void launchwebsite() throws IOException {
		System.out.println("Given...");
		testsetup.testbase.webmanager();
		/*WebDriverManager.chromedriver().setup(); 
		testsetup.driver = new ChromeDriver();*/
				}
	@When("^form1 is displayed$")
	public void loginform() {
		
		//testsetup.driver.get("https://www.saucedemo.com/");

		System.out.println("When...");}
	@And("^enter valid credentials for1 (.+) and (.+)$")
	public void enter_valid_credentials_for_and(String string1, String string2) throws IOException {

		System.out.println("And...");
		System.out.println(string1); 
		System.out.println(string2);
		
		LoginFormpage login=testsetup.pageobjectmanager.login(testsetup.testbase.webmanager());
		login.entertxt(string1, string2);
		login.submitform();
		/*LoginFormpage login=new LoginFormpage(testsetup.driver);
		login.entertxt(string1, string2);
		login.submitform();*/
		
	} 
 

		
	


	
}
