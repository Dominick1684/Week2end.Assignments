package week2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Which is your favorite UI Automation tool?
		WebElement dd1 = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));	
		Select drop = new Select(dd1);
		drop.selectByIndex(1);
		
		//Choose your preferred country.
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		
		//Confirm Cities belongs to Country is loaded
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@id='j_idt87:city_label']")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Chennai')]")).click();
		
		//Choose the Course
		driver.findElement(By.xpath("//button[contains(@class,'ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only')]")).click();
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		
		//Language
		driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
		driver.findElement(By.xpath("//li[text()='Tamil']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@id='j_idt87:value_label']")).click();
		driver.findElement(By.xpath("//li[@id='j_idt87:value_3']")).click();
		
		
		 
		
	}
}
