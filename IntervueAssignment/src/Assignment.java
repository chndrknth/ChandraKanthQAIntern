import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedIntervueAssignment {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.intervue.io");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[text()='Login'])[1]")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(allwindows);
		driver.switchTo().window(tabs.get(1));
	//driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.name("email")).sendKeys("neha@intervue.io");
		driver.findElement(By.name("password")).sendKeys("Neha@intervue@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//span[text()='Search by candidate name, profile etc.']")).click();

		driver.findElement(By.xpath("//input[@placeholder='Type what you want to search for']")).sendKeys("hello");
		driver.findElement(By.xpath("(//span[text()='hello'])[1]")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[text()='Neha']")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.close();

		
	}

}
