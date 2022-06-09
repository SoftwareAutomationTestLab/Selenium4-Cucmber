package Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import pageObjects.PageObjectManager;


public class TestContextSetUp {
	public RemoteWebDriver driver;
	public PageObjectManager pageobjectmanager;
	public TestBase testbase;

	
	public TestContextSetUp() throws IOException {
		testbase=new TestBase();
		
		pageobjectmanager=new PageObjectManager(testbase.webmanager());}
	
	
	
} 
