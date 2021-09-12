package week5.Day2;


import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadExcel extends BaseClassExcel {
	
	@Test(dataProvider="sendData")
	public void CreateL(String Company,String FirstName,String LastName,String PhNo) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(PhNo);
		driver.findElement(By.name("submitButton")).click();
	
}
	
	@DataProvider
	public String[][] sendData() throws IOException
	{
		return ReadExcel.reaData("Sheet1");
		
	}
	
}






