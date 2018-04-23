package com.jala.Magnus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Users_search {
	
	WebDriver driver = null;
	@BeforeClass(groups= { "functional", "smoke","regretion "})
	public void SetUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VEERA\\Documents\\Jala\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://magnus1.jalatechnologies.com/");
		driver.findElement(By.xpath("//a[@href='Admin.aspx']")).click();;
		driver.findElement(By.xpath("//input[@id='txtname']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtpsw']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='btnlogin']")).click();
	}
	
	
	//Test case to test the User Search
	@Test(groups= {"functional", "smoke"} )
	public void TestUsersSearch() {
		driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul[1]/child::li[3]")).click();
		driver.findElement(By.xpath("//input[@id='txtname1']")).sendKeys("raju");
		driver.findElement(By.xpath("//input[@id='btnsearch']")).click();
		driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul[1]/child::li[5]")).click();
	}
}
