package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UpdateInci extends BaseSnow {
	@Test
	public void updateIn() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("gsft_main");
		WebElement search=driver.findElementByXPath("(//input[@class='form-control'])");
		search.sendKeys("INC0000046");
		search.sendKeys(Keys.ENTER);
		
		//click result
		driver.findElementByXPath("(//a[@class='linked formlink'])").click();
		
		//State
		WebElement state = driver.findElementByXPath("(//select[@class='form-control'])[3]");
		Select sta=new Select(state);
		sta.selectByValue("2");
		//Urgency
		WebElement urgentdd=driver.findElementByXPath("(//select[@class='form-control'])[5]");
		Select s=new Select(urgentdd);
		s.selectByValue("1");
	
	
				
		
		
		
		
	}

}
