package lunchBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitPractice {
	WebDriver driver;

	public void LaunchBrowsers() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mandira\\selenium\\SeleniumSession1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		driver.manage().window().maximize();

	}

	public void Test() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	public void TearDown() {
		driver.close();
		driver.quit();

}}
