package Variable;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		ChromeDriver Chrome=new ChromeDriver();
		//Chrome.get("http://facebook.com");
		Chrome.get("http:/bing.com");
		
		
		Chrome.quit();
		
	}

}
