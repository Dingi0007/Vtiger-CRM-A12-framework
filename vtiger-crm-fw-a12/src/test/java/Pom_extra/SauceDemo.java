package Pom_extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
	public static void main (String[] args ) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		LoginPage Ip = new LoginPage(driver);
//      Login		
//      Declaration with initialization	    
		WebElement un = Ip.getUn();
		WebElement pwd = Ip.getPwd();
		WebElement login = Ip.getLogin();

		
		driver.navigate().refresh();
		
//      Utilization		
		un.sendKeys("standard_user");
		pwd.sendKeys("secret_sauce");
		login.click();
//      verify
		HomePage hp = new HomePage(driver);
		
//      Declaration with initialization	
		WebElement logo = hp.getLogo();
//		utilization
		if(logo.isDisplayed()) {
			System.out.println("Logged in successfully!!!");
		} else {
			System.out.println("could not login");
		}
		Thread.sleep(5000);
		driver.quit();
		}
}
