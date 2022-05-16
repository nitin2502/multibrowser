package demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Masterint extends  Multi
{
@Test
  public void Panchayat() throws Exception
  {
	 driver.get("http://trti.mahamining.com/login");
		driver.manage().window().maximize();
		Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"home_login\"]")).click();
		Thread .sleep(1000);
		//Admin login
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("admin");
	   Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("admin");
	    Thread .sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[4]/button")).click();
		Thread .sleep(1000);
		//Selection of master
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/h2/button")).click();
		Thread .sleep(1000);
		//selection of designation
		driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/ul/li[3]/a")).click();
		Thread .sleep(1000);
		//select commiti level
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-designation/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-designation/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
		Thread .sleep(1000);  
		//Enter designation name
		driver.findElement(By.xpath("//input[@placeholder='Designation Name']")).sendKeys("ITgdDPP");
		Thread .sleep(1000); 
		//click on submit button
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-designation/div/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
		Thread .sleep(3000); 
		//click on edit button
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-designation/div/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[4]/button[1]")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-designation/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("  //*[@id=\"content\"]/app-designation/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//input[@placeholder='Designation Name']")).clear();
		Thread .sleep(1000); 
		//enter updated data
		driver.findElement(By.xpath("//input[@placeholder='Designation Name']")).sendKeys("ITGDPSP");
		Thread .sleep(1000);
		//click on update button
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-designation/div/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
		Thread .sleep(1000); 
		//click on delete button
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-designation/div/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[4]/button[2]")).click();
		Thread .sleep(2000);
		driver.switchTo().alert().accept();
	
	
  }
}
