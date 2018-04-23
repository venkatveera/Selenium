package com.jala.Magnus;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class More {
	WebDriver driver = null;
	@BeforeClass(groups= { "functional", "smoke","regretion "} )
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VEERA\\Documents\\Jala\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://magnus1.jalatechnologies.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://magnus1.jalatechnologies.com/");
		driver.findElement(By.xpath("//a[@href='Admin.aspx']")).click();;
		driver.findElement(By.xpath("//input[@id='txtname']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtpsw']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='btnlogin']")).click();
		driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul[1]/child::li[4]")).click();
	}
	
	//Test case to test the Multiple Tabs in More page
	@Test(groups= {"functional", "smoke"} )
	public void testMultipleTabs() {
		driver.findElement(By.xpath("//input[@placeholder='Tab1TextField 1']")).sendKeys("fds");
		driver.findElement(By.xpath("//input[@placeholder='Tab1TextField 2']")).sendKeys("fds");
		driver.findElement(By.xpath("//a[text()='Two']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Tab2TextField 1']")).sendKeys("fds");
		driver.findElement(By.xpath("//input[@placeholder='Tab2TextField 2']")).sendKeys("fds");
		driver.findElement(By.xpath("//a[text()='Three']")).click();
		driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul[1]/child::li[4]")).click();

	}
	
	//Test case to test the Menu in More page
	@Test(groups= {"functional", "smoke"} )
	public void testMenu() {
		driver.findElement(By.xpath("//a[@href='menu.aspx']")).click();
		driver.findElement(By.xpath("//a[@id='b1']")).click();
		driver.findElement(By.xpath("//a[@id='b2']")).click();
		driver.findElement(By.xpath("//a[@id='b3']")).click();
		driver.findElement(By.xpath("//a[@id='b4']")).click();
		driver.findElement(By.xpath("//a[text()='Sub Menus']")).click();
		driver.findElement(By.xpath("//a[text()='Testing']")).click();
		driver.findElement(By.xpath("//a[@id='selbtn']")).click();
		driver.findElement(By.xpath("//a[@id='manualbtn']")).click();
		driver.findElement(By.xpath("//a[@id='dbbtn']")).click();
		driver.findElement(By.xpath("//a[@id='unitbtn']")).click();
		driver.findElement(By.xpath("//a[text()='JAVA']")).click();
		driver.findElement(By.xpath("//a[@id='advjavabtn']")).click();
		driver.findElement(By.xpath("//a[@id='corejavabtn']")).click();
		driver.findElement(By.xpath("//a[@id='springbtn']")).click();
		driver.findElement(By.xpath("//a[@id='hibernatebtn']")).click();
		driver.findElement(By.xpath("//a[text()='.Net']")).click();
		driver.findElement(By.xpath("//a[@id='cbtn']")).click();
		driver.findElement(By.xpath("//a[@id='aspbtn']")).click();
		driver.findElement(By.xpath("//a[@id='adobtn']")).click();
		driver.findElement(By.xpath("//a[@id='mvcbtn']")).click();
		driver.findElement(By.xpath("//a[text()='Database']")).click();
		driver.findElement(By.xpath("//a[@id='sqlbtn']")).click();
		driver.findElement(By.xpath("//a[@id='mysqlbtn']")).click();
		driver.findElement(By.xpath("//a[@id='oraclebtn']")).click();
		driver.findElement(By.xpath("//a[@id='h2btn']")).click();
		driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul[1]/child::li[4]")).click();

	}
	
	//Test case to test the Auto Complete in More page
	@Test(groups= {"functional", "smoke"} )
	public void testAutoComplete() {
		driver.findElement(By.xpath("//a[@href='auto.aspx']")).click();
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("hi");
		driver.findElement(By.xpath("//a[text()='Multiple Values']")).click();
		driver.findElement(By.xpath("//input[@id='mtags']")).sendKeys("hello");
		driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul[1]/child::li[4]")).click();

	}
	
	//Test case to test the Collapsible Content in More page
	@Test(groups= {"functional", "smoke"} )
	public void testCollapsibleContent() {
		driver.findElement(By.xpath("//a[@href='collapse.aspx']")).click();
		driver.findElement(By.xpath("//a[text()='Testing']")).click();
		driver.findElement(By.xpath("//a[text()='Java']")).click();
		driver.findElement(By.xpath("//a[text()='.NET']")).click();
		driver.findElement(By.xpath("//a[text()='DataBase']")).click();
		driver.findElement(By.xpath("//a[@href='#b']")).click();
		//driver.findElement(By.xpath("//a[@href='#collapsea']")).click();
		//driver.findElement(By.xpath("//a[@href='#collapseb']")).click();
		//driver.findElement(By.xpath("//a[@href='#collapsec']")).click();
		//driver.findElement(By.xpath("//a[@href='#collapsed']")).click();
		driver.findElement(By.xpath("//a[text()='Testing']")).click();
		driver.findElement(By.xpath("//a[text()='Java']")).click();
		driver.findElement(By.xpath("//a[text()='.NET']")).click();
		driver.findElement(By.xpath("//a[text()='DataBase']")).click();
		driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul[1]/child::li[4]")).click();

	}
	
	//Test case to test the Slider in More page
	@Test(groups= {"functional", "smoke"} )
	public void testSlider() {
		driver.findElement(By.xpath("//a[@href='slide.aspx']")).click();
		int x=10;
	    WebElement slider = driver.findElement(By.id("slider"));
	    int width=slider.getSize().getWidth();
	    Actions move = new Actions(driver);
	    move.moveToElement(slider, ((width*x)/100), 0).click();
	    move.build().perform();
	    System.out.println("Slider moved");
		driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul[1]/child::li[4]")).click();

	}
	
	//Test case to test the Tooltips in More page
	@Test(groups= {"functional", "smoke"} )
	public void testTooltips() {
		driver.findElement(By.xpath("//a[@href='tips.aspx']")).click();
		driver.findElement(By.xpath("//button[@id='btn-tip']")).click();
		driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul[1]/child::li[4]")).click();

	}
	
	//Test case to test the Popups in More page
	@Test(groups= {"functional", "regration"} )
	public void testPopups() {
		driver.findElement(By.xpath("//a[@href='win.aspx']")).click();
		driver.findElement(By.xpath("//a[@id='btn-one']")).click();
		driver.findElement(By.xpath("//a[@id='btn-two']")).click();
		driver.findElement(By.xpath("//a[@id='btn-three']")).click();
		driver.findElement(By.xpath("//a[@id='btn-four']")).click();
		driver.findElement(By.xpath("//a[@id='btn-five']")).click();
		String peranthandle= driver.getWindowHandle();
		Set<String> s1= driver.getWindowHandles();
		for(String handle:s1) {
			if(!peranthandle.equalsIgnoreCase(handle))
			{
				String childhandle= handle;
				driver.switchTo().window(childhandle);
				driver.close();
			}
		}
		driver.switchTo().window(peranthandle);
		//driver.findElement(By.xpath("//a[@id='btn-six']")).click();
		//driver.switchTo().
		driver.findElement(By.xpath("//input[@id='alert']")).click();
		Alert a= driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("//input[@id='confirm']")).click();
		Alert a2= driver.switchTo().alert();
		a2.accept();
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		Alert a1= driver.switchTo().alert();
		a1.sendKeys("Venkat");
		a1.accept();
		driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul[1]/child::li[4]")).click();

	}
	
	//Test case to test the Links in More page
	@Test(groups= {"functional", "regration"} )
	public void testLinks() {

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total links are " + links.size());

		// Printing all the links in a page
		for (int i = 0; i < links.size(); i++) {

			WebElement ele = links.get(i);

			String url = ele.getAttribute("href");
			System.out.println("Link is : " + ele);

			verifyLinkStatus(url);

		}

		// Checking the status of each link
		for (int i = 0; i < links.size(); i++) {

			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			verifyLinkStatus(url);

		}

	}

	public void verifyLinkStatus(String linkUrl) {
		try {
			URL url = new URL(linkUrl);

			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
			httpURLConnect.connect();

			int respCode = httpURLConnect.getResponseCode();

			if (respCode >= 400) {
				System.out.println(url + " is a broken link");
			} else {
				System.out.println(url + " is a valid link");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul[1]/child::li[4]")).click();
		
	}
	
	//Test case to test the CSS properties in More page
	@Test(groups= "functional, regration" )
	public void testCSSProperties() {
		driver.findElement(By.xpath("//a[@href='css.aspx']")).click();
		driver.findElement(By.xpath("//div[@id='a']/child::a[1]")).click();
		driver.findElement(By.xpath("//div[@id='a']/child::a[2]")).click();
		driver.findElement(By.xpath("//div[@id='a']/child::a[3]")).click();
		driver.findElement(By.xpath("//div[@id='a']/child::a[4]")).click();
		driver.findElement(By.xpath("//div[@id='a']/child::a[5]")).click();
		String peranthandle= driver.getWindowHandle();
		Set<String> s1= driver.getWindowHandles();
		for(String handle:s1) {
			if(!peranthandle.equalsIgnoreCase(handle))
			{
				String childhandle= handle;
				driver.switchTo().window(childhandle);
				driver.close();
			}
		}
		driver.switchTo().window(peranthandle);
		driver.findElement(By.xpath("//a[text()='Labels']")).click();
		driver.findElement(By.xpath("//a[text()='Buttons']")).click();
		driver.findElement(By.xpath("//div[@id='c']/child::button[1]")).click();
		driver.findElement(By.xpath("//div[@id='c']/child::button[2]")).click();
		driver.findElement(By.xpath("//div[@id='c']/child::button[3]")).click();
		driver.findElement(By.xpath("//div[@id='c']/child::button[4]")).click();
		driver.findElement(By.xpath("//div[@id='c']/child::button[5]")).click();
		driver.findElement(By.xpath("//a[text()='Alerts']")).click();
		driver.findElement(By.xpath("//a[text()='Progress Bars']")).click();
		driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul[1]/child::li[4]")).click();

	}
	//Test case to test the Iframes in More page
	@Test(groups= {"functional", "smoke"} )
	public void testIframes() {
		driver.findElement(By.xpath("//a[@href='mainIframe.aspx']")).click();
		int size= driver.findElements(By.xpath("//div[@id='form-container']")).size();
		System.out.println("total size" +size);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//li[@id='menu_projects']/a")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id='txtBox']")).sendKeys("Hello");
		driver.findElement(By.xpath("//button[@id='frameBtn']")).click();
		driver.switchTo().defaultContent();	
		driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul[1]/child::li[4]")).click();

	}
}
