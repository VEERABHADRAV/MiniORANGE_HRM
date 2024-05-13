package selenium;
 
	import java.util.concurrent.TimeUnit;
	 
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	 
	public class Bahu {
		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]")).click();
			Thread.sleep(1000);
			WebElement admin=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]"));
			admin.click();
			Thread.sleep(2000);
			WebElement jobDropdown=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]"));
			jobDropdown.click();
	 
			Thread.sleep(1000);
			WebElement createjt = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[4]/a"));
			Thread.sleep(2000);
			Thread.sleep(1000);
			WebElement cjc =driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[4]/a"));
			cjc.click();
			Thread.sleep(2000);
			WebElement ajc =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
			ajc.click();
			Thread.sleep(2000);
			WebElement ajt =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
			ajt.sendKeys("Test Engineer");
			Thread.sleep(2000);
			WebElement sjt =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
			sjt.click();
//			USE EXCEPTION HANDLING FOR THE ERROR
			Thread.sleep(2000);

			try
			{
				String art = driver.findElement(By.xpath("//span[@data-v-957b4417='']")).getText();
				if (art.equals("Already exists"))
				{
					driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/jobCategory");
				}
			}
			catch(Exception e)
			{
			}
	 
			Thread.sleep(2000);
			WebElement cjt =driver.findElement(By.xpath("//i[@data-v-6179b72a='']"));
			cjt.click();
	 
			Thread.sleep(3000);
			WebElement djt =driver.findElement(By.xpath("//button[@data-v-f5806396='']"));
			djt.click();
	 
			Thread.sleep(3000);
			WebElement cdjt =driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[3]/button[2]"));
			cdjt.click();
////			-----------------------------------------------------------------------------------------------------------
////			Thread.sleep(3000);
////			System.out.println(driver.switchTo().alert().getText());
//			//---------------------------------------------------------------------------------------------
	//
			Thread.sleep(3000);
			WebElement org =driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]"));
			org.click();
			Thread.sleep(3000);
			WebElement loc =driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[2]/a"));
			loc.click();
	 
			Thread.sleep(3000);
			WebElement aloc =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/div/button"));
			aloc.click();
	 
			Thread.sleep(3000);
			WebElement amloc =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input"));
			amloc.sendKeys("Chennai");
			driver.findElement(By.xpath("(//input[@placeholder='Type here ...'])[2]")).sendKeys("Chennai");
			driver.findElement(By.xpath("(//input[@placeholder='Type here ...'])[3]")).sendKeys("Tamil Nadu");
			driver.findElement(By.xpath("(//input[@placeholder='Type here ...'])[4]")).sendKeys("660098");
//			------------------------------------------------------------------------------------------------------------------------------
//			driver.findElement(By.className("oxd-select-wrapper")).click();
//			WebElement list= driver.findElement(By.className("oxd-select-text-input"));
//			Select drop=new Select(list);
//			drop.selectByVisibleText("India");
//			
			//driver.findElement(By.className("oxd-select-wrapper")).
//			Thread.sleep(3000);
//			WebElement mm = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[4]/div/div[2]/div/div"));
//			Select dd = new Select(mm);
//			dd.deselectByVisibleText("Aruba");
	 
			Thread.sleep(3000);// i am not able to do it
			WebElement dropdown = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[4]/div/div[2]/div/div"));
			dropdown.click(); // click on the dropdown to open it
	
//			Thread.sleep(3000);//part 2
//			// find the option you want to select and click on it
//			driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[4]/div/div[2]/div/div/div[1]")).click();
	//
//			Thread.sleep(3000);//save button
//			WebElement sloc =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
//			sloc.click();
	//
//			Thread.sleep(3000);//delete all loc
//			WebElement dloc =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[1]/div/label/span/i"));
//			dloc.click();
	//
//			Thread.sleep(3000);//delete all loc
//			WebElement dbloc =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/button"));
//			dbloc.click();
	//
//			Thread.sleep(3000);//delete all loc
//			WebElement daloc =driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[3]/button[2]"));
//			daloc.click();
	//-------------------------------------------------------------------------------------------------------------------------------------------
			//Add code to navigate to skills page
			WebElement org1 =driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]"));
			org1.click();
			Thread.sleep(3000);
			WebElement loc1 =driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a"));
			loc1.click();
	 
	 
			Thread.sleep(3000);//ADD SKILL BUTTON
			WebElement adds =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
			adds.click();
	 
			Thread.sleep(3000);//SEND SKIIL
			WebElement addsk =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
			addsk.sendKeys("Testing Demo");
	 
			Thread.sleep(3000);//ADD SKILL SAVE BUTTON
			WebElement addss =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
			addss.click();
			Thread.sleep(3000);//DELETE THE TESTING DEMO
			WebElement ds =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[19]/div/div[4]/div/button[1]/i"));
			ds.click();
	 
			Thread.sleep(3000);//DELETE THE TESTING DEMO
			WebElement das =driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[3]/button[2]"));
			das.click();
	 
			//WRITE A CODE TO VERIFY IT
			Thread.sleep(3000);
			Alert al=driver.switchTo().alert();
			al.getText();
	 
	 
			Thread.sleep(3000);//LOG OUT
			WebElement loo =driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i"));
			loo.click();
	 
			Thread.sleep(3000);//LOG OUT 1
			WebElement log =driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
			log.click();
			driver.close();
		}
	}


