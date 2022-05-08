package pkg1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Whatsapp_project {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\salenium folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
	
		driver.manage().window().maximize();
		//drag and drop concept 
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe [@role='presentation']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		WebElement searchElement=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchElement.click();
		
		searchElement.sendKeys("whatsapp web");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//h3[text()='WhatsApp Web']")).click();
		Thread.sleep(100000);
		
		WebElement search=driver.findElement(By.xpath("//div[@title='Search input textbox']"));
		search.click();
		Thread.sleep(2000);
		search.sendKeys("Akshay Sir Automation");
		Thread.sleep(3000);
		
		WebElement msg=driver.findElement(By.xpath("(//span[text()='Akshay Sir Automation'])[1]"));
		msg.click();
		Thread.sleep(5000);
		
		WebElement typemsg=driver.findElement(By.xpath("//div[@title='Type a message']"));
		typemsg.click();
		Thread.sleep(2000);
		typemsg.sendKeys("Hello I am Akshay using Selenium 4.1.2 automation tool,sending msg for you automated.Have a nice day");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@class='tvf2evcx oq44ahr5 lb5m6g5c svlsagor p2rjqpw5 epia9gcq']")).click();
		Thread.sleep(2000);
		
		
		
		}

}
