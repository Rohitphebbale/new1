package Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webappsecurity {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.get("http://zero.webappsecurity.com/login.html");
		Thread.sleep(2000);
		d.findElement(By.name("user_login")).sendKeys("username");
		Thread.sleep(2000);
		d.findElement(By.name("user_password")).sendKeys("password");
		Thread.sleep(2000);
		d.findElement(By.name("submit")).click();
		
		
		//site cannot open
		
		
	}
}
