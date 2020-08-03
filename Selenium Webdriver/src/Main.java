import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir = System.getProperty("user.dir");
		System.err.println(System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", dir + "\\driver\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
//	
//		driver.get("https://facebook.com");
//		
//
//		
//		System.setProperty("webdriver.gecko.driver", dir + "\\driver\\geckodriver.exe");
//		WebDriver driverFirefox = new FirefoxDriver();
//		driverFirefox.get("https://facebook.com");
////		
//		driver.quit();
//		driverFirefox.quit();
//		JS_EX1 ex1 = new JS_EX1();
		System.err.println("Bai tap 1");
		driver.get("https://all.accor.com/usa/index.en.shtml");
		
		WebElement btnCheckOut = driver.findElement(By.id("search-dateout-boo"));
		if(btnCheckOut.getAttribute("disabled").compareTo("true") == 0)
			System.err.println("The checkout button is disabled");
		btnCheckOut.getText();
		System.err.println(btnCheckOut.getAttribute("disabled"));
//		System.err.println(btnCheckOut.getText());
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement btnDestination = driver.findElement(By.id("search-destination"));
		btnDestination.sendKeys("France");
		btnDestination.sendKeys(Keys.ENTER);

		WebElement btnCheckin = driver.findElement(By.id("search-dateIn-boo"));
		btnCheckin.sendKeys(Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement autoSuggest = driver.findElement(By.id("ChIJMVd4MymgVA0R99lHx5Y__Ws"));
		autoSuggest.click();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		String searchXpath = "//*[@type='submit' and @class='tSubmit roundButton roundButton--accent']";
		WebElement btnSearch = driver.findElement(By.xpath(searchXpath));
		btnSearch.click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 15, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='noUi-handle noUi-handle-lower']")));
		
		WebElement btnSlider = driver.findElement(By.xpath("//*[@class='noUi-handle noUi-handle-lower']"));
		System.err.println("The slider button is available");
		
		System.err.println(btnSlider.getAttribute("aria-valuenow"));
	    Actions move = new Actions(driver);
	    move.moveToElement(btnSlider).clickAndHold().moveByOffset(189,0).release().perform();
	    
//		btnSlider.
		//driver.quit();
		
	}

}
