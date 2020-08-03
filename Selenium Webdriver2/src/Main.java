import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
		WebDriverWait wait = new WebDriverWait(driver, 15, 100);
		Actions builder = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		String productCorrect = "Printed Summer Dress";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("search_query_top")).sendKeys(productCorrect);
		driver.findElement(By.name("submit_search")).click();
		int numberProduct = driver.findElements(By.cssSelector("ul.product_list li.ajax_block_product")).size();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		//Find product and add to card
		String AddXpath = "//*[@class='product-name' and @title='Printed Summer Dress' and @href='http://automationpractice.com/index.php?id_product=5&controller=product&search_query=Printed+Summer+Dress&results=3']";
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("AddXpath"))).click();

		WebElement blockProduct = driver.findElement(By.xpath("AddXpath"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", blockProduct);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		builder.moveToElement(blockProduct).perform();
		blockProduct.click();

//		/* BÀI 1*/
//		System.err.println("Bai tap 1");
//		driver.get("http://automationpractice.com/index.php");
//		
//		WebElement btnSearch = driver.findElement(By.id("search_query_top"));
//		btnSearch.sendKeys("No Products");
//		btnSearch.sendKeys(Keys.ENTER);
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn btn-default button-search']")));
//
//		
//		WebElement btnSearch2 = driver.findElement(By.xpath("//*[@class='btn btn-default button-search']"));
//		btnSearch2.sendKeys(Keys.ENTER);
//	    
//		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
//		
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='heading-counter']")));
//		
//		WebElement textSearchResult = driver.findElement(By.xpath("//*[@class='alert alert-warning']"));
//		System.err.println(textSearchResult.getText());
//		
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//
//		
//		driver.close();
//		
//		/* BÀI 2*/
//		System.err.println("Bai tap 2");
//		driver = new ChromeDriver();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		driver.get("http://automationpractice.com/index.php");
//		driver.manage().window().maximize();
//		builder = new Actions(driver);
//		js.executeScript("window.scrollBy(0,1500)");
//		String[] ProductSize = new String[3];
//		String[] ProductName = new String[3];
//		String pageURL = "automationpractice.com";
//		
//		String productSizeXpath = "//*[@class='layer_cart_product_info']/*[@id='layer_cart_product_attributes']";
//		
//		WebElement blockProduct = driver.findElement(By.xpath("//*[@class='product-image-container']"));
//
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", blockProduct);
//
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		
//		builder.moveToElement(blockProduct).perform();
		
		
		

//		WebElement btnAdd = driver.findElement(By.xpath("//*[@class='button ajax_add_to_cart_button btn btn-default' and @data-id-product='1']"));
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='button ajax_add_to_cart_button btn btn-default' and @data-id-product='1']"))).click();
//		
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='layer_cart_product_info']/*[@class='product-name']"))).click();
//		WebElement product0 = driver.findElement(By.xpath("//*[@class='layer_cart_product_info']/*[@class='product-name']"));
//		ProductName[0] = new String(product0.getAttribute("innerText"));
//		
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(productSizeXpath))).click();
//		WebElement products0 = driver.findElement(By.xpath(productSizeXpath));
//		ProductSize[0] = new String(products0.getAttribute("innerText"));
//		ProductSize[0] = new String(products0.getAttribute("innerText")).split(",")[1].trim();
//		
//		System.out.println(product0.getAttribute("innerText"));
//		System.out.println(ProductSize[0]);
//		
//		String btnCrossXpath = "//*[@class='cross']";
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(btnCrossXpath))).click();
//		WebElement btnCross = driver.findElement(By.xpath(btnCrossXpath));
//		btnCross.click();
//		
//		// Find and add item2
//		
//		WebElement blockProduct2 = driver.findElement(By.xpath("//*[@class='replace-2x img-responsive' and @alt='Blouse']"));
//
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", blockProduct2);
//
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		
//		builder.moveToElement(blockProduct2).perform();
//		
//		WebElement btnAdd2 = driver.findElement(By.xpath("//*[@class='button ajax_add_to_cart_button btn btn-default' and @data-id-product='2']"));
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='button ajax_add_to_cart_button btn btn-default' and @data-id-product='2']"))).click();
//
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='layer_cart_product_info']/*[@class='product-name']"))).click();
//		WebElement product1 = driver.findElement(By.xpath("//*[@class='layer_cart_product_info']/*[@class='product-name']"));
//		ProductName[1] = new String(product1.getText());
//		System.out.println(product1.getText());
//		
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(productSizeXpath))).click();
//		WebElement products1 = driver.findElement(By.xpath(productSizeXpath));
//		ProductSize[1] = new String(products0.getAttribute("innerText"));
//		ProductSize[1] = new String(products0.getAttribute("innerText")).split(",")[1].trim();
//		
//		System.out.println(product1.getAttribute("innerText"));
//		System.out.println(ProductSize[1]);
//		
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(btnCrossXpath))).click();
//		btnCross.click();
//
//		// Find and add item3
//		WebElement blockProduct3 = driver.findElement(By.xpath("//*[@class='replace-2x img-responsive' and @alt='Printed Dress']"));
//
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", blockProduct3);
//
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		
//		builder.moveToElement(blockProduct3).perform();
//		
//		WebElement btnAdd3 = driver.findElement(By.xpath("//*[@class='button ajax_add_to_cart_button btn btn-default' and @data-id-product='3']"));
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='button ajax_add_to_cart_button btn btn-default' and @data-id-product='3']"))).click();
//
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='layer_cart_product_info']/*[@class='product-name']"))).click();
//		WebElement product2 = driver.findElement(By.xpath("//*[@class='layer_cart_product_info']/*"));
//		ProductName[2] = new String(product2.getText());
//		System.out.println(ProductName[2]);
//
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(productSizeXpath))).click();
//		WebElement products2 = driver.findElement(By.xpath(productSizeXpath));
//		ProductSize[2] = new String(products2.getAttribute("innerText"));
//		ProductSize[2] = new String(products2.getAttribute("innerText")).split(",")[1].trim();
//		
//		System.out.println(product2.getAttribute("innerText"));
//		System.out.println(ProductSize[2]);
//		
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(btnCrossXpath))).click();
//		btnCross.click();
//		
//		System.err.println("Ten cac san pham la: ");
//		System.out.println(ProductName[0] + " " +   ProductName[1]+ " " +  ProductName[2]);
//		
//		String btnCartXpath = "//*[@class='shopping_cart']//*";
//		WebElement btnCart = driver.findElement(By.xpath(btnCartXpath));
//		builder.moveToElement(btnCart).perform();
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='shopping_cart']//*"))).click();
//		
//		
//		//Kiem tra man hinh summary
//		String pageSummaryURL = driver.getCurrentUrl();
//		boolean isFound = pageSummaryURL.contains(pageURL);
//		System.err.println("Trang summary la " + isFound);
//		
//		// Kiem tra ten va size cua product
//		String xpathP1 = "//*[@id='product_1_1_0_0']";
//		String xpathP2 = "//*[@id='product_2_7_0_0']";
//		String xpathP3 = "//*[@id='product_3_13_0_0']";
//		
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(xpathP1))).click();
//		WebElement p1 = driver.findElement(By.xpath(xpathP1));
//		System.out.println(p1.getAttribute("innerText"));
//		if(p1.getAttribute("innerText").contains(ProductName[0]) && p1.getAttribute("innerText").contains(ProductSize[0]))
//			System.err.println("San pham 1 dung");
//		
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(xpathP2))).click();
//		WebElement p2 = driver.findElement(By.xpath(xpathP2));
//		System.out.println(p1.getAttribute("innerText"));
//		if(p2.getAttribute("innerText").contains(ProductName[1]) && p2.getAttribute("innerText").contains(ProductSize[1]))
//			System.err.println("San pham 2 dung");
//		
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(xpathP3))).click();
//		WebElement p3 = driver.findElement(By.xpath(xpathP3));
//		System.out.println(p1.getAttribute("innerText"));
//		if(p3.getAttribute("innerText").contains(ProductName[2]) && p3.getAttribute("innerText").contains(ProductSize[2]))
//			System.err.println("San pham 3 dung");
//		/* BÀI 3*/
//		
//		System.err.println("Bai tap 3");
//		
//		String xPathCheckout = "//*[@class='button btn btn-default standard-checkout button-medium']";
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(xPathCheckout))).click();
//
//		try {
//			wait.wait(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.err.println("Bai tap 3 dai qua nen minh khong choi nua nha, do anh bat duoc em hihi");
		driver.quit();
	}

}
