import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Check_box {
	public static void main(String[] args) {

		// Configuring the system properties of chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Chrome\\chromedriver.exe");

		//Initializing the browser driver
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("input[id='ctl00_mainContent_rbtnl_Trip_2']")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//a[id='MultiCityModelAlert']")).click();		

		}
		}
	
	
		
        
   
	
    
	
