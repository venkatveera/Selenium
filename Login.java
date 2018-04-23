package com.jala.Magnus;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver = null;
	@BeforeClass(groups= { "functional", "smoke","regretion "} )
	public void SetUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VEERA\\Documents\\Jala\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://magnus1.jalatechnologies.com/");
	}
	// test case to test with valid credentials
		@Test(groups= {"functional", "smoke"} )
		public void testValid() {
		driver.findElement(By.xpath("//a[@href='Admin.aspx']")).click();;
		driver.findElement(By.xpath("//input[@id='txtname']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtpsw']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='btnlogin']")).click();
		driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul[1]/child::li[5]")).click();
	}
		// test case to test with invalid credentials
		@Test(groups= { "functional", "smoke"} )
		public void testInvaid() {
			driver.findElement(By.xpath("//a[@href='Admin.aspx']")).click();;
			driver.findElement(By.xpath("//input[@id='txtname']")).sendKeys("admi");
			driver.findElement(By.xpath("//input[@id='txtpsw']")).sendKeys("admi");
			driver.findElement(By.xpath("//input[@id='btnlogin']")).click();
			String text=driver.findElement(By.xpath("//span[@id='lbl']")).getText();
			System.out.println(text);
		}
		
		// test case to test without credentials
				@Test(groups= {"functional", "regration"} )
				public void testWithoutValues() {
					driver.findElement(By.xpath("//a[@href='Admin.aspx']")).click();;
					driver.findElement(By.xpath("//input[@id='txtname']")).sendKeys("");
					driver.findElement(By.xpath("//input[@id='txtpsw']")).sendKeys("");
					driver.findElement(By.xpath("//input[@id='btnlogin']")).click();
					String unm=driver.findElement(By.xpath("//span[@id='ctl06']")).getText();
					System.out.println(unm);
					String psw=driver.findElement(By.xpath("//span[@id='RequiredFieldValidator1']")).getText();
					System.out.println(psw);
				}
}
