package actitimeapp.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import actitimeapp.elementRepository.GeneralSettingsPage;
import actitimeapp.elementRepository.TimeTrackPage;
import actitimeapp.genericLib.BaseClass;

public class DropdownHandling extends BaseClass {
	@Test
	public void handleDropdown()
	{
//		driver.findElement(By.className("popup_menu_button_settings")).click();
//		driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']/..")).click();
//		WebElement userGroups=driver.findElement(By.id("userGroupNamingCodeSelect"));
//		cu.getSelectByVisibleText(userGroups,"Location");
//		String msg=driver.findElement(By.id("FormModifiedTextCell")).getText();
//		System.out.println(msg);
		
		TimeTrackPage tt=new TimeTrackPage(driver);
		//click on settings
		tt.clickSettings();
		//click on generalSettings
		tt.clickgeneralSettings();
		GeneralSettingsPage gp=new GeneralSettingsPage(driver);
		//handle usergroups dropdown
		cu.getSelectByVisibleText(gp.getUsergroupsDD(),"Location");
		//get msg
		System.out.println(gp.getModificationMsg());
		
	}
		
}



 





