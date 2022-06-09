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
import pageObjects.productspage;

public class validatepage {


	TestContextSetUp testsetup;
	public  validatepage(TestContextSetUp testsetup) {
		this.testsetup=testsetup;
	}
	 
	@Then("^product page must be displayed1")
	public void productpage() throws IOException {
		System.out.println("Then...");
		productspage vp=testsetup.pageobjectmanager.productpage(testsetup.testbase.webmanager());
		String ptxt=vp.txt();
		if(ptxt.equalsIgnoreCase(ptxt))
		 {
			System.out.println("yes...");}
		else
		{System.out.println("No...");
			
		}
		
		/*productspage vp=new productspage(testsetup.driver);
		String ptxt=vp.txt();
		if(ptxt.equalsIgnoreCase(ptxt))
		 {
			System.out.println("yes...");}
		else
		{System.out.println("No...");
			
		}
*/
 
	
	}}
 