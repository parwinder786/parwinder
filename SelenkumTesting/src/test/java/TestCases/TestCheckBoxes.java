package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckBoxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/*
		driver.findElement(By.xpath("//div[4]/input[1]")).click();
		
		driver.findElement(By.xpath("//div[4]/input[2]")).click();
		
		driver.findElement(By.xpath("//div[4]/input[3]")).click();
		
		driver.findElement(By.xpath("//div[4]/input[4]")).click();*/
		
		//so if we have 100 checkboxes so it can not be optimized way to write 100 lines of code. to opti,ize it we
		//gonna use for loop
		
		for(int i=1;i<=4;i++) {
			
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
		}
		

	}

}
