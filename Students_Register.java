package com.jala.Magnus;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Students_Register {
	WebDriver driver = null;
	@BeforeClass(groups= { "functional", "smoke","regretion "} )
	public void SetUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VEERA\\Documents\\Jala\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://magnus1.jalatechnologies.com/");
		driver.findElement(By.xpath("//a[@href='Admin.aspx']")).click();;
		driver.findElement(By.xpath("//input[@id='txtname']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtpsw']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='btnlogin']")).click();
	}
	
	//Test with valid data
	@Test(groups= {"functional", "smoke"} )
	public void testValid() {
		driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul[1]/child::li[1]")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("veng");
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("fhd");
		driver.findElement(By.xpath("//input[@id='emailID']")).sendKeys("veng@gmail.com");
		driver.findElement(By.xpath("//input[@id='mnum']")).sendKeys("9684373285");
		driver.findElement(By.xpath("//input[@id='radiobtn_0']")).click();
		driver.findElement(By.xpath("//select[@id='ddlcountry']/option[text()='India']")).click();
		driver.findElement(By.xpath("//select[@id='ddlcity']/option[text()='Hyderabad']")).click();
		driver.findElement(By.xpath("//input[@id='CheckBoxList1_0']")).click();
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("04/04/1991");
		driver.findElement(By.xpath("//input[@id='btnsubmit']")).click();
		Alert a= driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul[1]/child::li[4]")).click();
		
	}
	//Test with invalid data
		@Test(groups= {"functional", "regration"} )
		public void testInvalid() {
			driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul[1]/child::li[1]")).click();
			driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("");
			String fn= driver.findElement(By.xpath("//span[@id='rfvFirstName']")).getText();
			System.out.println(fn);
			driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("");
			String ln= driver.findElement(By.xpath("//span[@id='rfvLastName']")).getText();
			System.out.println(ln);
			driver.findElement(By.xpath("//input[@id='emailID']")).sendKeys("");
			String id= driver.findElement(By.xpath("//span[@id='rfvEmail']")).getText();
			System.out.println(id);
			driver.findElement(By.xpath("//input[@id='mnum']")).sendKeys("");
			String num= driver.findElement(By.xpath("//span[@id='rfvMobile']")).getText();
			System.out.println(num);
			//driver.findElement(By.xpath("//input[@id='radiobtn_0']")).click();
			String btn= driver.findElement(By.xpath("//span[@id='RequiredFieldValidator1']")).getText();
			System.out.println(btn);
			//driver.findElement(By.xpath("//select[@id='ddlcountry']")).click();
			String cun= driver.findElement(By.xpath("//span[@id='rfv1']")).getText();
			System.out.println(cun);
			//driver.findElement(By.xpath("//select[@id='ddlcity']")).click();
			String cty= driver.findElement(By.xpath("//span[@id='rfv2']")).getText();
			System.out.println(cty);
			//driver.findElement(By.xpath("//input[@id='CheckBoxList1_0']")).click();
			String box= driver.findElement(By.xpath("//span[@id='teckskills']")).getText();
			System.out.println(box);
			driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("");
			String bod= driver.findElement(By.xpath("//span[@id='RequiredFieldValidator2']")).getText();
			System.out.println(bod);
			driver.findElement(By.xpath("//input[@id='btnsubmit']")).click();
			//Alert at= driver.switchTo().alert();
			//at.accept();
			driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul[1]/child::li[4]")).click();
			
		}

}
