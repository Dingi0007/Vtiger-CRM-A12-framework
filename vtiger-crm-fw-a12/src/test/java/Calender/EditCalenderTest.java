package Calender;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EditCalenderTest {
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

        // Click on Calendar
        driver.findElement(By.linkText("Calendar")).click();

        Thread.sleep(2000);

        // Open existing event (search by subject name "Follow-up call with ABC Corp")
        WebElement eventLink = driver.findElement(By.linkText("Follow-up call with ABC Corp"));
        eventLink.click();

        Thread.sleep(2000);

        // Click on Edit button
        WebElement editBtn = driver.findElement(By.name("Edit"));
        editBtn.click();

        Thread.sleep(2000);

        // Clear and update Subject field
        WebElement subjectField = driver.findElement(By.name("subject"));
        subjectField.clear();
        subjectField.sendKeys("Updated Call with XYZ Ltd");

        Thread.sleep(1000);

        // Clear and update Location field
        WebElement locField = driver.findElement(By.name("location"));
        locField.clear();
        locField.sendKeys("DELHI");

        Thread.sleep(1000);

        // Save changes
        driver.findElement(By.name("eventsave")).click();

        Thread.sleep(2000);

        // Logout
        WebElement profilePic = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));

        Actions act = new Actions(driver);
        act.moveToElement(profilePic).build().perform();

        Thread.sleep(2000);
        driver.findElement(By.linkText("Sign Out")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}

