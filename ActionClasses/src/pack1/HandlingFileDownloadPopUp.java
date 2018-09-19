package pack1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileDownloadPopUp {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.seleniumhq.org/download/");
	 WebElement element = driver.findElement(By.xpath("//a[text()='3.14.0']"));
	 element.click();
	 try {
		 Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\autoit\\New AutoIt v3 Script.exe");
		 
	 }catch (IOException e) {
		e.printStackTrace();
	}
	
}
}