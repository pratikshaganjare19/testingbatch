package actitmepakagemaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
@FindBy(xpath="//input[@name='username']")
private WebElement username;
@FindBy(xpath ="//input[@name='pwd']")
private WebElement password;

@FindBy(xpath="//a[@id='loginButton']")
private WebElement loginbutton;

@FindBy(xpath="//input[@id='keepLoggedInCheckBox']")
private WebElement keepLoggedInCheckBox;

public Loginpage(WebDriver driver)	
{
	PageFactory.initElements(driver, this);
}
public void sendusername() {
	username.sendKeys("pmghorpade20@gmail.com");
}
public void sendpassword() {
password.sendKeys("9096029354");	
}
public void selectkeepLoggedInCheckBox() {
	keepLoggedInCheckBox.click();
}
public void loginbutton() {
	loginbutton.click();	
}
}