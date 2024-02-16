package NewProject;

import org.testng.annotations.AfterSuite;

//import java.time.Duration;
//
//import org.openqa.selenium.By;

//import java.util.List;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

import pageObejcts.actions;
import pageObejcts.assertions;

@Listeners
public class testCases extends actions{
	actions action;
	assertions assertion;
	String currentUrl ="https://magento.softwaretestingboard.com/";
	String message = "Welcome, cypress user!";

	@BeforeSuite
	public void myBeforeTest() {
		action = new actions();
		assertion = new assertions();
		action.maximizeBrowser();
	}

	@Test(description = "Login functionality")
	public void login() throws InterruptedException {
		extentTest = extentReport.createTest("Login Functionality","to check login functionality");
	    extentTest.log(Status.INFO, "login Test Start");
	    action.visitWebsite();
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));	
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sign In")));	
		action.clickOnSignInButton();
		action.typeInEmailField();
		action.typeInPasswordField();
		action.clickOnSignButton();
		assertion.checkCurrentURLIsContain(currentUrl);
		Thread.sleep(3000);
		assertion.checkHeaderIsContain(message);
	}

	@AfterSuite
	public void myAfterTest() {
		action.closeBrowser();
	}
}