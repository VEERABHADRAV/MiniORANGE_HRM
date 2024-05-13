package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class project {

			@SuppressWarnings("deprecation")
			public static void main(String[] args) throws InterruptedException {
				//invoke the browser
				WebDriver driver=new FirefoxDriver();
				//maximize the window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				//open the URL
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

				//Login
				driver.findElement(By.name("username")).sendKeys("Admin");
				driver.findElement(By.name("password")).sendKeys("admin123");
				
				WebElement button=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]"));
				button.click();
				
				//Verify the current URL and check if it contains the string “dashboard”.
				String url=driver.getCurrentUrl();
				if(url.contains("dashboard"))
				{
					System.out.println("'dashboard' present in the url");
				}
				else
				{
					System.out.println("'dashboard' not present in the url");
				}

				//Go to Admin Tab
				WebElement admin=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]"));
				admin.click();

				//Go to the Job tab 
				WebElement jobDropdown=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]"));
				jobDropdown.click();

				// check ‘Job Titles’ is there or not.
				WebElement title=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]"));
				if(title.isDisplayed())
				{
					System.out.println("'Job Title' is visible");
					title.click();
				}
				else
				{
					System.out.println("Job Title not available");
				}


				//Click on “Job Titles”
				List<WebElement> jobs =driver.findElements(By.xpath("//div[@data-v-6c07a142='']"));
				for(WebElement job : jobs)
				{
					System.out.println(job.getText());
				}

				//Click on “Add Button” icon, add job as “Automation Tester”
				driver.findElement(By.cssSelector(".oxd-button")).click();
				
				// add job as “Automation Tester”
				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Automation Tester");
		 
				
				
//LOG OUT
				WebElement loo =driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i"));
				loo.click();
				
				
				WebElement log =driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
				log.click();
				
				


				WebElement logout=driver.findElement(By.cssSelector("button[type='submit']"));
				logout.click();
				
				driver.close();
				
			}
		 
		

	}


