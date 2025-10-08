package Object_repository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import generic_Utility.FileUtility;

public class LoginPage {

    public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

   
//    @FindBy(name = "user-name")
//	private WebElement un;

//	@FindBy({
//		@FindBy(name = "user_name"), 
//		@FindBy(css = "input[type='text']"),
//		@FindBy(xpath = "//input[@type='text']")

//	})
//    private WebElement un;


//	@FindBys({
//		@FindBy(name = "user_name"), 
//		@FindBy(css = "input[type='text']"),
//		@FindBy(xpath = "//input[@type='text']")
//	})
      private WebElement un;
	
//  Auto - Healing      
	@FindAll({
		@FindBy(name = "user_name"), 
		@FindBy(css = "input[type='text']"),
		@FindBy(xpath = "//input[@type='text']")
    })
     private WebElement un1;

	@FindBy(name = "user_password")
	private WebElement pwd;
	
	@FindBy(id = "submitButton")
	private WebElement loginBtn;
	
	
	public WebElement getUn() {
		return un;
	}
	
	public WebElement getPwd() {
		return pwd;
	}
	
	public WebElement getLogin() { 
		return loginBtn;
	}	
		public void login() throws IOException {
        FileUtility fUtil = new FileUtility();
		String USERNAME = fUtil.getDataFromPropertiesFile("un");
		String PASSWORD = fUtil.getDataFromPropertiesFile("pwd");

	    un.sendKeys(USERNAME);
		pwd.sendKeys(PASSWORD);
	    loginBtn.click();
	
	}	
}

