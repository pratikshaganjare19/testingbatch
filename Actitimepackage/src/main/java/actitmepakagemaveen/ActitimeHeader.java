package actitmepakagemaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHeader {
@FindBy(xpath ="//div[text()='Time-Track']")
private WebElement timeTrack;

@FindBy(xpath ="//a[@class='content tasks']")
private WebElement tasks;

@FindBy(xpath ="//div[text()='Reports']")
private WebElement reports;

@FindBy(xpath ="//div[text()='Users']")
private WebElement user;

@FindBy(xpath ="//a[text()='Logout']")
private WebElement logout;

public ActitimeHeader(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clickOnTimeTrack() {
	timeTrack.click();
}
public void clickOnTaskTab() {
	tasks.click();
}
public void clickOnReportTab() {
	reports.click();
}
public void clickOnLogout() {
	logout.click();
}


public void clickOnUserTab() {
	user.click();
}
}
