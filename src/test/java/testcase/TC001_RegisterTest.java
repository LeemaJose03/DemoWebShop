package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC001_RegisterTest extends ProjectSpecification{

	
	@BeforeTest
	public void setup() {
		
		excelfile="TC001_RegisterTest";
		
	}
	
	@Test(dataProvider ="getData" )
	public void registerTest(String firstname, String lastname, String email, String password, String conPassword) {
		
		new HomePage(driver)
		.clickRegister()
		.gender()
		.firstName(firstname)
		.lastName(lastname)
		.email(email)
		.password(password)
		.confirmPass(conPassword)
		.regButtonClick();
		
	}
	
}
