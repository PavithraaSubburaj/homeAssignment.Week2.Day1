package homeassignment.week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		//Adding Implicit Wait for loading the page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//To open the Facebook URL
		driver.get("https://en-gb.facebook.com/");
		// To maximize the Window
		driver.manage().window().maximize();
		//To click the Create New Account Button
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		//To enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Subburaj");
		//To enter the surname
		driver.findElement(By.name("lastname")).sendKeys("Krishnasamy");
		//To enter MobileNumber or emailID
		//driver.findElement(By.xpath("//input[@name='reg_email__']]")).sendKeys("subbu1892@gmail.com");
		driver.findElement(By.name("reg_email__")).sendKeys("subbu1892@gmail.com");
		//To Enter the new Password
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("XXXyyyZZZ");
		//To Select Day
		WebElement Birthday = driver.findElement(By.id("day"));
		Select Day = new Select(Birthday);
		Day.selectByIndex(25);
		//To Select Month
				WebElement Birthmonth = driver.findElement(By.id("month"));
				Select Month = new Select(Birthmonth);
				Month.selectByIndex(2);
		//To Select Year
				WebElement Birthyear = driver.findElement(By.id("year"));
				Select Year = new Select(Birthyear);
				Year.selectByIndex(30);
				//Sleep
				
		//To select Gender
				driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input")).click();
		//To close the Webpage
		driver.close();
	}

}
