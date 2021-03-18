package org.tcs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace-Ajith\\Sample\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
    WebElement mouseCourse = driver.findElement(By.xpath("//a[text()='COURSES']"));	
	Actions a= new Actions(driver);
	a.moveToElement(mouseCourse).build().perform();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	WebElement txtOracle = driver.findElement(By.xpath("//a[text()='Oracle Training ']"));
	String text = txtOracle.getText();
	System.out.println(text);
	WebElement att = driver.findElement(By.xpath("//a[contains(text(),'Oracle SQL Training')]"));
	a.moveToElement(att).perform();
	String attribute = att.getAttribute("value");
	System.out.println(attribute);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
