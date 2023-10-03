package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaTutorial {
public static void main(String[] args) {
	//ChromeOptions options= new ChromeOptions();
	//options.setBrowserVersion("113");
	//WebDriver driver = new ChromeDriver(options);
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement srcbx = driver.findElement(By.id("APjFqb"));
	srcbx.sendKeys("Java tutorial");
	srcbx.sendKeys(Keys.ENTER);
	String strTitle = driver.getTitle();
	System.out.println(strTitle);
	System.out.println(driver.getCurrentUrl());

}
}
