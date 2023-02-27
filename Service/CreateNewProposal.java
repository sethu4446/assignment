package Service;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewProposal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev140572.service-now.com\r\n");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	    driver.switchTo().frame(0);
	    WebElement username = driver.findElement(By.id("user_name"));
	    username .sendKeys("admin");
	    WebElement password= driver.findElement(By.id("user_password"));
	    password.sendKeys("P-qQ7@umSYz8");
	    WebElement find = driver.findElement(By.id("sysverb_login"));
	    find.click();
	    driver.switchTo().defaultContent();
		WebElement search = driver.findElement(By.id("filter"));
		search.sendKeys("proposal");
		WebElement finds = driver.findElement(By.xpath("//div[text()='My Proposals']"));
		finds.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement button = driver.findElement(By.id("sysverb_new"));
		button.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement findElement = driver.findElement(By.id("std_change_proposal.short_description"));
		findElement.sendKeys("sethumadhavan");
	    driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();

	}

}
