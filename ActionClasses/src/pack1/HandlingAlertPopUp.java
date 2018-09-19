package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopUp {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/admin/Desktop/actionclasshtml/alertpopup.html");
	WebElement button= driver.findElement(By.xpath("//button[text()='Try it']"));
	button.click();
	Alert alert = driver.switchTo().alert();
	String msg = alert.getText();
	System.out.println(msg);
	//alert.accept();
	//alert.dismiss();
}
}