package Calender;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class SearchCalenderTest {

		public static void main(String[] args) throws InterruptedException {
			
			// Open browser
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			// Login
			driver.get("http://localhost:8888/");
			
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("manager");
			driver.findElement(By.id("submitButton")).click();
			
			// Click on Calendar
			driver.findElement(By.linkText("Calendar")).click();
			Thread.sleep(2000);
			
			// Search event (jo mene create test me banaya tha)
			WebElement searchBox = driver.findElement(By.name("search_text"));
			searchBox.sendKeys("Follow-up call with ABC Corp");
			
			// Click on Search button
			driver.findElement(By.name("search")).click();
			Thread.sleep(2000);
			
			// Verify search result (agar event mila to table me dikhega)
			try {
				WebElement result = driver.findElement(By.xpath("//a[text()='Follow-up call with ABC Corp']"));
				if(result.isDisplayed()) {
					System.out.println("✅ Event found in calendar search: " + result.getText());
				}
			} catch (Exception e) {
				System.out.println("❌ Event not found in calendar search!");
			}
			
			// Logout
			WebElement profilePic = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
			Actions act = new Actions(driver);
			act.moveToElement(profilePic).build().perform();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Sign Out")).click();
			
			// Close
			Thread.sleep(2000);
			driver.quit();
		}
	}


