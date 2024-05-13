package selenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SwitchToDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement firser = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		firser.sendKeys("selenium");
		WebElement sercil = driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
		sercil.click();
		
		List<WebElement>serres = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
		for(int i= 0;i<serres.size();i++)
		{
			System.out.println(serres.get(i).getText());
			serres.get(i).click();
//			if(serres.equals("Selenium"))
//			{
//				serres.get(i).click();
//			}
		}
//		for (WebElement res :serres)
//		{
//			System.out.println(res.getText());
//			res.click();
//		}
		
		Set<String> Ids=driver.getWindowHandles();
		for (String winId:Ids)
		{
			String title=driver.switchTo().window(winId).getTitle();
			System.out.println(title);
		}
	}

}
