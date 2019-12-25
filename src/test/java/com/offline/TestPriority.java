package com.offline;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.Logs;

import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.ImeHandler;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;

class TestNavigation implements Navigation{

	@Override
	public void back() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void to(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void to(URL arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

class TestOptions implements Options{

	@Override
	public void addCookie(Cookie arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllCookies() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCookie(Cookie arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCookieNamed(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cookie getCookieNamed(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Cookie> getCookies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImeHandler ime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Logs logs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Timeouts timeouts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Window window() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class TestWindow implements Window{

	@Override
	public void fullscreen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension getSize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void maximize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPosition(Point arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSize(Dimension arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

class TestTimeouts implements Timeouts{

	@Override
	public Timeouts implicitlyWait(long arg0, TimeUnit arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Timeouts pageLoadTimeout(long arg0, TimeUnit arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Timeouts setScriptTimeout(long arg0, TimeUnit arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class TestTargetLocator implements TargetLocator{

	@Override
	public WebElement activeElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alert alert() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebDriver defaultContent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebDriver frame(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebDriver frame(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebDriver frame(WebElement arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebDriver parentFrame() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebDriver window(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class TestWebDriver implements WebDriver{

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void get(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

public class TestPriority {
	
	//Default priority is 0
	//if we don't define the priority for a test, that will be executed first then rest of the test cases will be executed
	//based on defined priority
	//In case priority is not set then the test scripts execute in alphabetical order.
	
	@Test
	public void testMethod1(){
		System.out.println("TestPriority.testMethod1()");
	}
	
	@Test(priority=2)
	public void testMethod2(){
		System.out.println("TestPriority.testMethod2()");
	}
	
	@Test(priority=1)
	public void testMethod3(){
		System.out.println("TestPriority.testMethod3()");
	}
	
	@Test(priority=1)
	public void aTestMethod4(){
		System.out.println("TestPriority.testMethod4()");
	}
	
	@Test
	public void alphaMethod1(){
		System.out.println("TestPriority.alphaMethod1()");
	}
	
	@Test(priority=-1)
	public void testNegativePriority(){
		System.out.println("TestPriority.testNegativePriority()");
	}

}
