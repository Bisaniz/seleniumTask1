package NewProject;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObejcts.actions;
import pageObejcts.assertions;

@Listeners
public class searchFunctionality extends actions{
actions action;
String productName = "shirt";
String title = "Thank you for your purchase!";
assertions assertion ; 

@BeforeSuite
public void myBeforeTest()throws InterruptedException {
	action = new actions();
	assertion = new assertions();
	action.visitWebsite();
	action.maximizeBrowser();
	Thread.sleep(2000);
}

	  @Test(description = "searchFunctionality")
      public void searchItems() throws InterruptedException{
		  extentTest = extentReport.createTest("searchFunctionality");
		    extentTest.log(Status.INFO, "search Test Start");

		  action.typeInSearchField(productName);
     	//action.printPageTitle();
		  Thread.sleep(3000);
		  chooseItem("Radiant Tee");
		  Thread.sleep(1000);
		  chooseSize();
		  chooseColor();
		  Thread.sleep(1000);
		  clickOnAddToCartButton();
		  Thread.sleep(3000);
		  clickOnCart();
		  Thread.sleep(3000);
		  clickOnProceesButton();
		  Thread.sleep(3000);
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));	
		   wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
		   //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-password")));
		  typeInEmail();
		  Thread.sleep(2000);
//          WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));
//		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-password")));
//		  typeInPassword();
		  typeInFirstNameField();
		  typeInLastNameField();
		  typeInCompanyField();
		  typeInStreetField();
		  typeInCityField();
		  selectStateByItsIndex(1);
		  typeInPostalField();
		  typeInPhoneField();
		  Chooseshippingmethod();
		  Thread.sleep(2000);
		  clickOnNextButton();
		  Thread.sleep(3000);
		  placeOrder();
		  Thread.sleep(3000);
     	  assertion.checkPageTitleIsContain(title);
      }

@AfterSuite
public void myAfterTest() {
	action.closeBrowser();
}

}
