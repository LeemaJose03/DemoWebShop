package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class HomePage extends ProjectSpecification{

	@FindBy(xpath="//a[text()='Register']")
	WebElement register;
	
	@FindBy(xpath="//a[text()='Log in']")
	WebElement login;
	
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	
	public RegisterPage clickRegister() {
		
		click(register);
		return new RegisterPage(driver);
		
	}
	
	public LoginPage clickLogin() {
		
		click(login);
		return new LoginPage(driver);
	}
	
}
