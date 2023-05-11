package actitimeapp.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import actitimeapp.genericLib.BaseClass;
import actitimeapp.genericLib.CommonUtility;
import actitimeapp.genericLib.DataUtility;

public class AlertHandling extends BaseClass {
	@Test
	public void handleAlert() throws EncryptedDocumentException, IOException {
		
		driver.findElement(By.className("popup_menu_button_settings")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.id("name")).sendKeys(du.getDataFromExcelsheet("Sheet3", 2, 1));
		driver.findElement(By.xpath("//td[@id='ButtonPane']/input[2]")).click();
		String msg=cu.getMsgfromAlert(driver);
		System.out.println(msg);
		cu.alertCancel(driver);
		
}

}






