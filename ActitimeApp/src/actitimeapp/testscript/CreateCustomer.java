package actitimeapp.testscript;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import actitimeapp.genericLib.BaseClass;
import actitimeapp.genericLib.CommonUtility;
import actitimeapp.genericLib.DataUtility;
@Listeners(actitimeapp.genericLib.ListenerImplementation.class)
public class CreateCustomer  extends BaseClass{
	@Test
	public void customerCreation() throws EncryptedDocumentException, IOException{
		String customername=du.getDataFromExcelsheet("Sheet3", 0, 1);
		int num=cu.getRandomNum();
		customername=customername+num;
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.className("createNewCustome")).click();
		driver.findElement(By.className("newNameField")).sendKeys(customername);
driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys
												(du.getDataFromExcelsheet("Sheet3", 1, 1));
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
cu.textPresentExplicitWait(driver, By.cssSelector(".titleEditButtonContainer>.title"),customername);
		String expCustomername=driver.findElement
				(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		System.out.println(expCustomername);
		}
	
}










