package Organization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EditOrganizationTest {
	public static void main(String[] args) throws InterruptedException {
		// open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// Login
		driver.get("http://localhost:8888/");

		// Enter UserName
		WebElement un = driver.findElement(By.name("user_name"));
		un.sendKeys("admin");

		// Enter Password
		WebElement pwd = driver.findElement(By.name("user_password"));
		pwd.sendKeys("manager");

		// Click LogIn
		driver.findElement(By.id("submitButton")).click();

		// Go to Organizations
		driver.findElement(By.linkText("Organizations")).click();

		Thread.sleep(2000);

		// click on Edit (yaha "edit" link pe click karenge)
		WebElement ele = driver.findElement(By.linkText("edit"));
		ele.click();

		Thread.sleep(2000);

		// profile logout
		WebElement profilePic = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));

		Actions act = new Actions(driver);
		act.moveToElement(profilePic).build().perform();

		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Out")).click();

		Thread.sleep(3000);
		driver.quit();
	}

}