package homeassignment.week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leaftaps.com/opentaps/");
		//To maximize the window
		driver.manage().window().maximize();
		//Enter a username and password.
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//To Click the "Login" button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//To Click on the "CRM/SFA" link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//To Click on the "Accounts" tab
		driver.findElement(By.linkText("Accounts")).click();
		//To Click on the "Create Account" button
		driver.findElement(By.linkText("Create Account")).click();
		//To Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("Pavithra");
		//To Enter a description as "Selenium Automation Tester
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//To Select Industry as Computer Software
				WebElement Industry = driver.findElement(By.name("industryEnumId"));
				Select Ind = new Select(Industry);
				Ind.selectByIndex(3);
		//To Select Ownership as S-Corporation
				WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
				Select Own = new Select(Ownership);
				Own.selectByVisibleText("S-Corporation");
		//To Select Employee as Source
				WebElement Employe = driver.findElement(By.name("dataSourceId"));
				Select Emp = new Select(Employe);
				Emp.selectByValue("LEAD_EMPLOYEE");
		//To Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
				WebElement Marketing = driver.findElement(By.name("marketingCampaignId"));
				Select Mark = new Select(Marketing);
				Mark.selectByIndex(6);
		//To Select "Texas" as the state/province using SelectByValue.
				WebElement State = driver.findElement(By.name("generalStateProvinceGeoId"));
				Select Stat = new Select(State);
				Stat.selectByValue("TX");
//Click the "Create Account" button.
				driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

//Close the browser window.
				driver.close();
	}

}
