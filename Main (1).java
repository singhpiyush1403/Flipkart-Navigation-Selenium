import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateFlipkart {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("Http://Google.com");
	
	driver.get("http://www.flipkart.com");
	
	System.out.println(driver.getTitle());
	
	System.out.println(driver.getCurrentUrl());
	
	System.out.println(" Navigate Complete");
	
	driver.quit();
	

	}

}
