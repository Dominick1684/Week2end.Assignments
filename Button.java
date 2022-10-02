package week2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	
		driver.findElement(By.xpath("//span[text()='Click']//parent::button")).click();
		String button = driver.getTitle();
		System.out.println("Page Title is "+button);
		
		//back to the button page
		driver.navigate().back();
		
		boolean enabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		if(enabled) {
			System.out.println("Button is not enabled");
		}
		else {
			System.out.println("Button disabled");
		}
		
		Point location = driver.findElement(By.xpath("//span[text()='Submit']//parent::button[@id='j_idt88:j_idt94']")).getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println(x);
		System.out.println(y);
		
		//color
		String color = driver.findElement(By.xpath("//span[text()='Save']//parent::button[@id='j_idt88:j_idt96']")).getCssValue("color");
		System.out.println(color);
		//height and width
		Point height = driver.findElement(By.xpath("//span[text()='Submit']//parent::button[@id='j_idt88:j_idt98']")).getLocation();
		int x2 = height.getX();
		int y2 = height.getY();
		System.out.println(x2);
		System.out.println(y2);
		
	}

}
