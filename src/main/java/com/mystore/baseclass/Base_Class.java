package com.mystore.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	public static WebDriver driver;
//Browser launch
	public static WebDriver browser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Operations\\eclipse-workspace\\Projects\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		return driver;
	}
	// Close
	public static void d_close() {
		driver.close();
	}
	// Quit
	public static void d_quit() {
		driver.quit();
	}
	// Navigate to
	public static void d_to(String url) {
		driver.navigate().to(url);
	}
	// Navigate back
	public static void d_back() {
		driver.navigate().back();
	}
	// Navigate forward
	public static void d_forward() {
		driver.navigate().forward();
	}
	// Navigate Refresh
	public static void d_refresh() {
		driver.navigate().refresh();
	}
	// Get
	public static void url(String s) {
		driver.get(s);
	}
	// Alert
	public static void demo_alert() {
		Alert al = driver.switchTo().alert();
		al.accept(); // or
		al.dismiss();
	}
	// Actions
	public static void d_actions(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
		ac.click().build().perform();// based on situation we use
	}
	// Frames
	public static void d_frames(WebElement element) {
		driver.switchTo().frame(element);
		
	}
	// Robot
	public static void d_robot() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN); // based on situation we use
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	// Window Handles
	public static void d_windowhandles() {
		Set<String> wh = driver.getWindowHandles();
		for (String str : wh) {
			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);
		}
	}
	// Drop down---Multiple--get options
	public static void all_options(WebElement element) {
		Select s1 = new Select(element);
		List<WebElement> options = s1.getOptions();
		for (WebElement alloptions : options) {
			System.out.println(alloptions.getText());
		}
	}
	// Check Box
	public static void d_checkbox() {
		// TODO Auto-generated method stub

	}
	// drop down-single--selectbyindex
	public static void selecti(WebElement element) {
		Select s2 = new Select(element);
		s2.selectByIndex(1);
	}	
	//get title
	public static void d_gettitle() {
	String text = driver.findElement(By.xpath("")).getText();
	System.out.println("the text is:"+text);
	}
	//get current url
	public static void d_currenturl() {
	String url = driver.getCurrentUrl();
	System.out.println("the url is:"+url);
	}
	//get text
	public static void d_getext() {
		String text = driver.findElement(By.xpath("")).getText();
		System.out.println(text);
	}
	//get attribute
	public static void d_attribute(String s) {
	WebElement l = driver.findElement(By.xpath(""));
	System.out.println(""+l.getAttribute(s));
	}
	//wait
	public static void d_implicit() {
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	//wait--explicit
	public static void d_explict(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	//take screenshot
	public static void d_Screenshoot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Operations\\eclipse-workspace\\Projects\\Screenshot\\fb.png");
		FileUtils.copyFile(source, des);
	}
	//sendkeys
	public static void d_sendkeys(WebElement element, String s) {
		element.sendKeys(s);
	}
	// get first selected options
	public static void d_getfirstselected(WebElement element) {
		Select s=new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}
	// get all selected options
	public static void d_getallselectedoptions(WebElement element) {
	 Select s= new Select(element);
	 List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	 for (WebElement all : allSelectedOptions) {
		 System.out.println(all.getText());
	}
	}
	// is multiple
	public static void d_ismultiple(WebElement element) {
		Select s=new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println("is multiple or not:"+multiple);
	}	 
    //Click
	public static void to_Click(WebElement button) {
		button.click();
	}
	//radiobutton
	public static void radiobutton() {
		WebElement radio = driver.findElement(By.name("radiobutton_0"));

	}
	//single
	public static void single(WebElement element) {
		Select s2 = new Select(element);
		s2.selectByIndex(11);
	}	
	
	//get url
	public static void geturl(String url) {
		driver.get(url);
	}
	
	public static void movetoElement(WebElement element) {
		Actions ac=new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
	public static void actionss(WebElement element) {
		Actions ac=new Actions(driver);
		ac.click(element).build().perform();

	}
	public static void framess(WebElement element) {
		Actions ac=new Actions(driver);
		ac.click(element).build().perform();
		driver.switchTo().defaultContent();

	}

}
