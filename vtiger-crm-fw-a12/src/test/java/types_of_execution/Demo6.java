package types_of_execution;

    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class Demo6 {
	    @Test(groups = "smoke") 
	    public void Case6() throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
	    Thread.sleep(5000);
	    driver.quit();
	    }
	    
	    @Test(groups = "reg") 
	    public void Case61() throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
	    Thread.sleep(5000);
	    driver.quit();
	    }
	    
	    @Test(groups = "reg") 
	    public void Case601() throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
	    Thread.sleep(5000);
	    driver.quit();
	    }
	}   


