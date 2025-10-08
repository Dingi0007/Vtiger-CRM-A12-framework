package contact;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateContactTest {
   public static void main(String[] args) throws InterruptedException {

// open browswer
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
// Login
		driver.get("http://localhost:8888/");
		
		WebElement username = driver.findElement(By.name("user_name"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("user_password"));
		password.sendKeys("password");
        
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(1000);
//      Create contact
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.cssSelector("img[alt='Create Contact...']")).click();
		
		String lastName = "Kumar";
		WebElement lastNameField = driver.findElement(By.name("lastname"));
		lastNameField.sendKeys(lastName);
		
//      save
		driver.findElement(By.xpath("//input[contains(@value,'Save ')]")).click();
		
//      Verification
        String actLastName = driver.findElement(By.id("dtlview_Last Name")).getText();
        if (actLastName.equals(lastName)) {
            System.out.println("Created contact + lastName + successfully!!!");
        }else {
        	System.out.println("Failed....");
        }
//      Logout
        WebElement profilePic = driver.findElement(By.cssSelector("img[src='themes']"));
        
        Actions act = new Actions(driver);
		act.moveToElement(profilePic).build().perform();		
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Out")).click();
//   	Close browser	
        Thread.sleep(3000);
		driver.quit();
   }   		
}
   
  
