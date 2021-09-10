package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteInci extends BaseSnow{
	@Test
	public void Del() throws InterruptedException {
		// TODO Auto-generated method stub
	
		driver.findElementByXPath("(//div[text()='All'])[2]").click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("gsft_main");
		WebElement r=driver.findElementByXPath("//a[@class='linked formlink']");
		r.click();
		driver.findElementByXPath("//button[text()='Delete']").click();
		WebElement ok=driver.findElementByXPath("//button[@id='ok_button']");
		String text = ok.getText();
		System.out.println(text);
		if(text.contains("Delete"))
				{
				System.out.println("Incident Deleted");
				}
		else
		{
			System.out.println("Incident not Deleted");
		}
		
		}

}
