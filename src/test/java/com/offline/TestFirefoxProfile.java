package com.offline;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class TestFirefoxProfile {

	FirefoxProfile fp=new FirefoxProfile();
	FirefoxOptions fo=new FirefoxOptions();
	WebDriver driver=null;
	WebDriver driver1=null;
	
	@Test
	public void testProfile(){
		fp.setAcceptUntrustedCertificates(true);
		fp.addExtension(new File(""));
		fp.setPreference("", true);
		fo.setProfile(fp);
		driver=new FirefoxDriver(fo);
		driver1=new FirefoxDriver(fp);
	}
	
	@Test
	public void testWebTable(){
		driver.get("url");
		WebElement table=driver.findElement(By.tagName("table"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(WebElement row:rows){
			List<WebElement> cells=row.findElements(By.tagName("td"));
			for(WebElement cell:cells){
				System.out.print(cell.getText()+"\t");
			}
			System.out.println();
		}
	}
	
	@Test
	public void testDragDrop(){
		WebElement source=driver.findElement(By.id(""));
		WebElement target=driver.findElement(By.id(""));
		WebElement slider=driver.findElement(By.id(""));
		Actions builder=new Actions(driver);
		builder.dragAndDrop(source, target).build().perform();
		builder.dragAndDropBy(source, 100, 200).build().perform();
		builder.moveToElement(source).clickAndHold().release(target).build().perform();
		//Drag slider
		builder.clickAndHold(slider).moveByOffset(50, 0).release().build().perform();
	}
	
	@Test
	public void testScroll(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement element=driver.findElement(By.id(""));
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
}
