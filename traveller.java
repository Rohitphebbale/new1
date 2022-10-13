package Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class traveller {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://phptravels.com/demo/");
		d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	//	d.findElement(By.className("jfHeader-menuListLink jfHeader-dynamicLink jfHeader-signup-action")).click();
		d.findElement(By.className("pace-done")).click();
		d.findElement(By.linkText("Create account")).click();
		Thread.sleep(2000);
		d.findElement(By.id("inputFirstName")).sendKeys("Rohit");
		d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		d.findElement(By.id("inputLastName")).sendKeys("Hebbale");
		d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		d.findElement(By.id("inputEmail")).sendKeys("rohithebbale1008@gmail.com");
		d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		d.findElement(By.id("inputPhone")).sendKeys("7411120897");
		
		
		
		
	}

}
