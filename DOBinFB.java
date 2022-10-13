package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOBinFB {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		Thread.sleep(2000);
		d.get("https://www.facebook.com/");
		Thread.sleep(2000);
		d.findElement(By.linkText("Create New Account")).click();
		
		WebElement daylist =d.findElement(By.name("birthday_day"));
		Select date = new Select(daylist);
		date.selectByIndex(23);
		
		WebElement monthlist =d.findElement(By.name("'birthday_month"));
		Select month = new Select(monthlist);
		month.selectByValue("9");
		
		WebElement yearlist=d.findElement(By.name("birthday_year"));
		Select year = new Select(yearlist);
		year.selectByVisibleText("1996");
		
	}

}
