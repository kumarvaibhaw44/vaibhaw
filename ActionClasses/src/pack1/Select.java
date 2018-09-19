package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/admin/Desktop/actionclasshtml/Selectable.html");
	WebElement one = driver.findElement(By.name("one"));
	WebElement eight = driver.findElement(By.name("eight"));
	WebElement nine = driver.findElement(By.name("nine"));
	Actions act = new Actions(driver);
	act.keyDown(Keys.CONTROL).click(one).click(eight).click(nine).keyUp(Keys.CONTROL).perform();
}
} 
