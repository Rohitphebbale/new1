package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedin {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		Thread.sleep(2000);
		d.get("https://www.linkedin.com/login/");
		d.findElement(By.id("session_key")).sendKeys("rohithebbale1@gmail.com");
		d.findElement(By.id("session_password")).sendKeys("prapti2017");
		d.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div[2]form/button")).click();
		String u = d.getCurrentUrl();
		if(u.equals("https://www.linkedin.com/login/"))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failled");
		}
		
	}

}
