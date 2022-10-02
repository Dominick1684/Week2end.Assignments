package week2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Inputbox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Input Fields
		//driver.findElement(By.xpath("//input[@id='j_idt88:name']//parent::div")).sendKeys("Dominick");
		driver.findElement(By.xpath("//input[@name='j_idt88:name']")).sendKeys("Dominick");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).clear();
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys("Pondicherry");
		//Verify field Enabled
		boolean Isenabled = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isEnabled();
		if (Isenabled) {
			System.out.println("Text box is enabled");
		}
		else {
			System.out.println("Text box is disabled");
		}
		driver.findElement(By.xpath("//input[@name='j_idt88:j_idt95']")).clear();
		
		//Get text not working
//		String text = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getText();
//		System.out.println(text);
		
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("abc@bbc.com", Keys.TAB);
		driver.findElement(By.xpath("//textarea[contains(@class,'ui-inputfield ui-inputtextarea')]")).sendKeys("Hey this is Dominick");
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("Work while you work");
		driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys("",Keys.ENTER);
		String text2 = driver.findElement(By.xpath("//span[text()='Age is mandatory']//parent::span")).getText();
		System.out.println(text2);
		if(text2.contains("Age")) {
			System.out.println("Mandatory Age field is verified");
		}
		else {
			System.out.println("Mandatory Age field is not verified");
		}
		 
		
		driver.findElement(By.xpath("//label[text()='Username']//preceding-sibling::input")).click();
		Point location = driver.findElement(By.xpath("//label[text()='Username']//preceding-sibling::input")).getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println(x);
		System.out.println(y);
 

	}

}
