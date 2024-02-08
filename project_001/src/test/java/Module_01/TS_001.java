package Module_01;

import org.bouncycastle.math.ec.ECCurve.Fp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import from_properties.data_from_Properties;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TS_001 {
	
	public static void main(String[] args) throws Throwable {
		data_from_Properties FP=new data_from_Properties();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get(FP.getdata_from_properties("url"));
	//	driver.navigate().to("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement search_WE = driver.findElement(By.xpath("//input[@name='q']"));
		search_WE.sendKeys("realme latest model");
		search_WE.submit();
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.quit();
		//driver.close();
	}

}
