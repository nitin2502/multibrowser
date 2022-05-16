package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multi {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
		//create firefox instance
			System.setProperty("webdriver.gecko.driver","C:\\Users\\niting\\Downloads\\geckodriver-v0.31.0-win64\\Geckodriver1\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\Downloads\\chromedriver_win32 (1)\\crom_drvr-2\\chromedriver.exe\\");
			//create chrome instance
			driver = new ChromeDriver();
		}
		//Check if parameter passed as 'Edge'
				else if(browser.equalsIgnoreCase("Edge")){
					//set path to Edge.exe
					System.setProperty("webdriver.edge.driver","C:\\Users\\niting\\Downloads\\edgedriver_win64\\edgedrvr\\msedgedriver.exe\\");
					//create Edge instance
					driver = new EdgeDriver();
				}
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
	}
	@Test()
	public void Userslmc() throws Exception 
	{  driver.get("http://trti.mahamining.com/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"home_login\"]")).click();
	Thread .sleep(1000);	
	//admin login
	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("admin");
   Thread .sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("admin");
    Thread .sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[4]/button")).click();
	Thread .sleep(2000);
	//click on user tab
	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/h2/button")).click();
	Thread .sleep(2000);
	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/div/div/ul/li[4]/a")).click();
	Thread .sleep(2000); 
	//click on user field
			driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[1]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
			Thread .sleep(1000); 	
			driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
			Thread .sleep(1000); 	
			driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[3]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
			Thread .sleep(1000);	
			driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
			Thread .sleep(1000);	
			//fill details
			driver.findElement(By.xpath("//input[@placeholder='Enter Full Name']")).sendKeys("Enterfullname");
			Thread .sleep(1000);	
			driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No']")).sendKeys("9730020958");
			Thread .sleep(1000);	
			driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("abcd2506@gmail.com");
			Thread .sleep(1000);	
			driver.findElement(By.xpath("//input[@placeholder='Enter User Name']")).sendKeys("Saurbhmasg");
			Thread .sleep(1000);	
			driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[7]/div/div/button")).click();
			Thread .sleep(1000);	
			driver.findElement(By.xpath("//textarea[@placeholder='Enter Address']")).sendKeys("abcdgh ,415,dsp road pune");
			Thread .sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
			Thread .sleep(3000);
			//update record
			driver.findElement(By.xpath("//button[@title='Edit User']")).click();
			Thread .sleep(1000);
		    //clear record
			driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No']")).clear();
			Thread .sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No']")).sendKeys("9730020959");
			Thread .sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).clear();
			Thread .sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("xyxzcvv@gmail.com");
			Thread .sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
			Thread .sleep(1000);
			//delete record
			driver.findElement(By.xpath("//button[@title='Remove User']")).click();
			Thread .sleep(1000);
			driver.switchTo().alert().accept();
			Thread .sleep(3000);
	}
	

	
	}

	 






