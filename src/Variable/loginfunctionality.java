package Variable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.log.Log;

public class loginfunctionality {

	private static final String LoginButton = null;

	public static void main(String[] args) {
	String applicationurladdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard,";

	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.get(applicationurladdress);
	String expected_ohrmHomepageTittle="orangeHRM";
	System.out.println("The expected Tittle of orange HRM application"+"Homepage is :"+expected_ohrmHomepageTittle);
	
	String actual_ohrmHomepageTittle =driver.getTitle();
	System.out.println("The expected Tittle of orange HRM application"+"Homepage is :"+actual_ohrmHomepageTittle);
	
	driver.findElement(By.id("text username")).sendKeys("srini");
	
	WebElement password=driver.findElement(By.name("text password"));
	
	password.sendKeys("Q@ Trainer7");//using the variable performing the //operation on the web element
	
	WebElement LoginButton=driver.findElement(By.className("button"));
	
	LoginButton.click();
	}

}

	

	
	

	
		
	
	
	


