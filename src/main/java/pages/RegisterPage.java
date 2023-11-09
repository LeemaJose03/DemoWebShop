package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecification;

public class RegisterPage extends ProjectSpecification {

	@FindBy(xpath="//label[text()='Female']")
	WebElement gender;
	
	@FindBy(id="FirstName")
	WebElement firstName;
	
	@FindBy(id="LastName")
	WebElement lastName;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement passWord;
	
	@FindBy(id="ConfirmPassword")
	WebElement conPass;
	
	@FindBy(id="register-button")
	WebElement regButton;
	
	
	
	public RegisterPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public RegisterPage gender() {
		
		click(gender);
		return this;
		
	}
	
	public RegisterPage firstName(String firstname) {
		
		sendKeys(firstName, firstname);
		return this;
	}
	
	public RegisterPage lastName(String lastname) {
		
		sendKeys(lastName, lastname);
		return this;
	}
	
	public RegisterPage email(String mail) {
		
		sendKeys(email, mail);
		return this;
	}
	
	public RegisterPage password(String pass) {
		
		sendKeys(passWord, pass);
		return this;
	}
	
	public RegisterPage confirmPass(String confpass) {
		
		sendKeys(conPass, confpass);
		return this;
	}
	
	public RegisterPage regButtonClick() {
		
		click(regButton);
		return this;
		
	}
	
	
}
