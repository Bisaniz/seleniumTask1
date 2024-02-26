package pageObejcts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import support.constants;
import support.extentReportClass;

public class actions extends extentReportClass implements constants{
//	public static int productQty = 0; 
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	public void visitWebsite() {
		driver.get("https://magento.softwaretestingboard.com");
	}
	
	public void clickOnSignInButton() {
		driver.findElement(By.linkText("Sign In")).click();
	}
	
	public void typeInEmailField() {
	driver.findElement(By.name("login[username]")).sendKeys(email);
		
	}
	
	public void typeInPasswordField() {
		driver.findElement(By.name("login[password]")).sendKeys(password);
	}
	
	public void clickOnSignButton() {
		driver.findElement(By.id("send2")).click();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void typeInSearchField(String prodcut) {
		driver.findElement(By.id("search")).sendKeys(prodcut+Keys.ENTER);
	}
	
	public void chooseItem(String product) {
		driver.findElement(By.linkText(product)).click();
	}
	
	public void chooseSize() {
		driver.findElement(By.id("option-label-size-143-item-167")).click();
	}
	public void chooseColor() {
		driver.findElement(By.id("option-label-color-93-item-56")).click();
	}
	
	public void clickOnAddToCartButton() {
		driver.findElement(By.className("tocart")).click();
	}
	public void clickOnCart() {
		driver.findElement(By.className("showcart")).click();
	}
	
	public void clickOnProceesButton() {
		driver.findElement(By.id("top-cart-btn-checkout")).click();
	}
	
	public void typeInEmail() {
		driver.findElement(By.id("customer-email")).sendKeys("hot"+ Integer.toString(((new Random().nextInt(10))+1))+"@gmail.com");
	}
	
	public void typeInPassword() {
		driver.findElement(By.id("customer-password")).sendKeys("Ptest123");
	}
	
	public void typeInFirstNameField() {
		driver.findElement(By.name("firstname")).sendKeys("first");
	}
	
	
	public void typeInLastNameField() {
		driver.findElement(By.name("lastname")).sendKeys("last");
	}
	
	public void typeInCompanyField() {
		driver.findElement(By.name("company")).sendKeys("comp");
	}
	
	
	public void typeInStreetField() {
		driver.findElement(By.name("street[0]")).sendKeys("00");
	}
	
	public void typeInCityField() {
		driver.findElement(By.name("city")).sendKeys("nablus");
	}
	
		public void selectStateByItsIndex(int index){
	        WebElement dropdownElement = driver.findElement(By.name("region_id"));
	        Select dropdown = new Select(dropdownElement);
	        dropdown.selectByIndex(index);
		}
	
		public void typeInPostalField() {
			driver.findElement(By.name("postcode")).sendKeys("0000");
		}
		
		public void typeInPhoneField() {
			driver.findElement(By.name("telephone")).sendKeys("0569888777");
		}
		
		public void Chooseshippingmethod() {
			driver.findElement(By.name("ko_unique_1")).click();
		}
		
		public void clickOnNextButton() {
			driver.findElement(By.cssSelector(".continue.primary")).click();
		}
		
		public void placeOrder() {
			driver.findElement(By.cssSelector(".action.checkout")).click();
		}
}
