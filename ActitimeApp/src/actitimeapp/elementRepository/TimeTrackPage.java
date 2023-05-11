package actitimeapp.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackPage {
	
	public TimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(className="popup_menu_button_settings")
	private WebElement settings;
	
	@FindBy(xpath="//div[text()='Manage system settings & configure actiTIME']/..")
	private WebElement generalSettingsLink;
	
	public WebElement getSettings()
	{
		return settings;
	}
	public WebElement getGeneralSettingsLink()
	{
		return generalSettingsLink;
	}
	
	//click on settings
	public void clickSettings()
	{
		getSettings().click();
	}
	//click on generalSettings
	public void clickgeneralSettings()
	{
		getGeneralSettingsLink().click();
	}

}








