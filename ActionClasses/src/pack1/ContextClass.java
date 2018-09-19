package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/admin/Desktop/actionclasshtml/ContextClick.html");
	WebElement element = driver.findElement(By.id("div-context"));
	Actions act = new Actions(driver);
	act.contextClick(element).perform();
	WebElement item1 = driver.findElement(By.name("Item 1"));
	
	item1.click();
}
}
