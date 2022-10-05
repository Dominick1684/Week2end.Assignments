package week2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	 //Your most favorite browser
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		driver.findElement(By.xpath("(//label[text()='Chennai'])")).click();
		
		//Find the default select radio button
		driver.findElement(By.xpath("(//label[text()='Chrome'])[2]")).click();
		
		//Select the age group
		driver.findElement(By.xpath("((//label[text()='21-40 Years'])")).click();
		
		
		 
		
	}
}
