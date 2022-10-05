package week2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
 

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	 driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']")).click();
	 driver.findElement(By.xpath("//span[text()='Ajax']")).click();
	 driver.findElement(By.xpath("//label[text()='Java']")).click();
	 driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
	 driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
	 
	 boolean checkbox = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isEnabled();
	 if(checkbox) {
		 System.out.println("Checkbox is disabled");
	 }
		
		 
	 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
			
	}
}
