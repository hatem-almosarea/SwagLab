package firstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases {
	
WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	
	public void mySetup () {
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void login() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		

	}
	
	@Test(priority = 2)
	public void addToCart() {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
	}
	
	@Test(priority = 3)
	
	public void logout() throws InterruptedException {
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("logout_sidebar_link")).click();
		
	}
	
	
	@AfterTest
	public void AfterThetestIsDone() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
