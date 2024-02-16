package pageObejcts;
//import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//import com.aventstack.extentreports.Status;

import support.constants;
import support.extentReportClass;

public class assertions extends extentReportClass implements constants {
	
	public void checkCurrentURLIsContain(String url) {
     	Assert.assertEquals(driver.getCurrentUrl(), url );
	}
	
	public void checkHeaderIsContain(String message) {
		Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]/span")).getText(),message);
	}
	
	public void checkPageTitleIsContain(String title) {
		Assert.assertEquals(driver.findElement(By.cssSelector(".page-title-wrapper")).getText(), title );
		
	}
}