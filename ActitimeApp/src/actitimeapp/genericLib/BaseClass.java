package actitimeapp.genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import actitimeapp.elementRepository.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver listenerdriver;
	public DataUtility du=new DataUtility();
	public CommonUtility cu=new CommonUtility();
	
	@BeforeClass(alwaysRun=true)
	public void launchBrowser()
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		listenerdriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod(alwaysRun=true)
	public void login() throws IOException
	{
		driver.get(du.getDataFromProperties("url"));
		LoginPage lp=new LoginPage(driver);
		lp.loginApp(du.getDataFromProperties("username"),du.getDataFromProperties("password"));
	}
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.quit();
	}

}










