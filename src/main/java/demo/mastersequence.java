package demo;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class mastersequence extends Multi
{ @Test()
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
@Test()
	public void USER_DLC() throws Exception
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
	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[1]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	Thread .sleep(1000); 	
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();
	Thread .sleep(1000); 	
	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[2]/div/ngx-select/div/div[2]/div")).click();
	Thread .sleep(1000);	
	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[23]/a/span")).click();
	Thread .sleep(1000);		
	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[3]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	Thread .sleep(1000);	
	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[7]/a/span")).click();
	Thread .sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[5]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	Thread .sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[5]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
	Thread .sleep(1000);	
	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[4]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	Thread .sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
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
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[9]/div/div/button")).click();
	Thread .sleep(1000);	
	driver.findElement(By.xpath("//textarea[@placeholder='Enter Address']")).sendKeys("abcdgh ,415,dsp road pune");
	Thread .sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
	Thread .sleep(3000);
	//update record
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[1]/i")).click();
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
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[2]/i")).click();
	Thread .sleep(1000);
	driver.switchTo().alert().accept();
	}
      @Test()
    public void User_DVLC() throws Exception
    	  {
        	driver.get("http://trti.mahamining.com/login");
    		driver.manage().window().maximize();
    		driver.findElement(By.xpath("//*[@id=\"home_login\"]")).click();
    		Thread .sleep(1000);	
    		//admin login
    		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("admin");
    	   Thread .sleep(1000);
    		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("admin");
    	    Thread .sleep(1000);	
    		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[4]/button")).click();
    		Thread .sleep(1000);
    		//click on user tab
    		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/h2/button")).click();
    		Thread .sleep(1000);
    		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/div/div/ul/li[4]/a")).click();
    		Thread .sleep(1000); 
    		//click on user field
    		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[1]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
    		Thread .sleep(1000); 	
    		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
    		Thread .sleep(1000); 	
    		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[2]/div/ngx-select/div/div[2]/div")).click();
    		Thread .sleep(1000);	
    		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[23]/a/span")).click();
    		Thread .sleep(1000);		
    		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[3]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
    		Thread .sleep(1000);	
    		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[7]/a/span")).click();
    		Thread .sleep(1000);	
    		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[4]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
    		Thread .sleep(1000);	
    		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
    		Thread .sleep(1000);	

    		//fill details
    		driver.findElement(By.xpath("//input[@placeholder='Enter Full Name']")).sendKeys("test design");
    		Thread .sleep(1000);	
    		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No']")).sendKeys("9730020958");
    		Thread .sleep(1000);	
    		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("abcd2506@gmail.com");
    		Thread .sleep(1000);	
    		driver.findElement(By.xpath("//input[@placeholder='Enter User Name']")).sendKeys("saurbhmasg");
    		Thread .sleep(1000);	
    		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[8]/div/div/button")).click();
    		Thread .sleep(1000);	
    		driver.findElement(By.xpath("//textarea[@placeholder='Enter Address']")).sendKeys("abcdgh ,415,dsp road pune");
    		Thread .sleep(1000);
    		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
    		Thread .sleep(3000);
    		//update record
    		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[1]/i")).click();
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
    		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[2]/i")).click();
    		Thread .sleep(1000);
    		driver.switchTo().alert().accept();
    		Thread .sleep(3000);
    	  }
     @Test()
     public  void User_SDLC() throws Exception
     { 
	    driver.get("http://trti.mahamining.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"home_login\"]")).click();
		Thread .sleep(1000);	
		Thread .sleep(1000);	
		//admin login
	    driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("admin");
	   Thread .sleep(1000);
	   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
	   Thread .sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[4]/button")).click();
		Thread .sleep(1000);
		//Click on master and user tab
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/h2/button")).click();
		Thread .sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/div/div/ul/li[4]/a")).click();
		Thread .sleep(1000);
		//select committee
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[1]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();
		Thread .sleep(1000); 
		//select division
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[3]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[7]/a/span")).click();
		Thread .sleep(1000); 
		//select district
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[4]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();
		Thread .sleep(1000); 
		//slect subdivisin
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[5]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[5]/div/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();
		Thread .sleep(1000); 
		//select taluka
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[6]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
		Thread .sleep(1000);
		//select designation
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[6]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
		Thread .sleep(1000);
		//fill details
		driver.findElement(By.xpath("//input[@placeholder='Enter Full Name']")).sendKeys("No name");
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No']")).sendKeys("9365989670");
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("abcd2506@gmail.com");
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//input[@placeholder='Enter User Name']")).sendKeys("abcdefghnh");
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[10]/div/div/button")).click();
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Address']")).sendKeys("abcdgh ,415,dsp road pune");
		Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
		Thread .sleep(3000);
		//update record
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[1]/i")).click();
		Thread .sleep(1000);
		
		//clear record
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No']")).clear();
		Thread .sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No']")).sendKeys("9365000000");
		Thread .sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).clear();
		Thread .sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("xyxzcvv@gmail.com");
		Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
		Thread .sleep(1000);
		//delete record
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[2]/i")).click();
		Thread .sleep(1000);
		driver.switchTo().alert().accept();
		Thread .sleep(3000);
      }
 
    @Test()
    public void User_VFRC() throws Exception
    { driver.get("http://trti.mahamining.com/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"home_login\"]")).click();
	Thread .sleep(1000);	
	//admin login
    driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("admin");
   Thread .sleep(1000);
   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
   Thread .sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[4]/button")).click();
	Thread .sleep(1000);
	//Click on master and user tab
	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/h2/button")).click();
	Thread .sleep(1000);
	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/div/div/ul/li[4]/a")).click();
	Thread .sleep(1000);
	//select committee
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[1]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	Thread .sleep(1000); 
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[6]/a/span")).click();
	Thread .sleep(1000); 
	//select division
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[3]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	Thread .sleep(1000); 
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[7]/a/span")).click();
	Thread .sleep(1000); 
	//select district
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[4]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	Thread .sleep(1000); 
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();
	Thread .sleep(1000); 
	//slect subdivisin
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[5]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	Thread .sleep(1000); 
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[5]/div/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();
	Thread .sleep(1000); 
	//select taluka
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[6]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	Thread .sleep(1000); 
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
	Thread .sleep(1000);
	//select VFRC
	//click on add button
	//driver.findElement(By.id("home_crsu")).click();
	//Thread .sleep(1000); 
//	//Every time change vfrc name
//	driver.findElement(By.xpath("//input[@placeholder='Enter VFRC']")).sendKeys("sangol");
//	Thread .sleep(1000); 	
//	driver.findElement(By.xpath("//input[@placeholder='Select Town/Village']")).click();
//	Thread .sleep(1000); 
//	driver.findElement(By.xpath("//*[@id=\"conditionsMdoalId\"]/form/div/div/div[2]/app-shared-manage-vfrc/form/div[1]/div[1]/div/div/div[7]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
//	Thread .sleep(1000); 
//	driver.findElement(By.xpath("//*[@id=\"conditionsMdoalId\"]/form/div/div/div[2]/app-shared-manage-vfrc/form/div[2]/div/button")).click();
//	Thread .sleep(1000); 
//
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[7]/div/ngx-select/div/div[2]/div")).click();
	Thread .sleep(1000); 
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[7]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
	Thread .sleep(1000);

	//select designation
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[9]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	Thread .sleep(1000); 
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[9]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
	Thread .sleep(1000); 
	//fill details
			driver.findElement(By.xpath("//input[@placeholder='Enter Full Name']")).sendKeys("No name");
			Thread .sleep(1000);	
			driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No']")).sendKeys("9365989670");
			Thread .sleep(1000);	
			driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("abcd2506@gmail.com");
			Thread .sleep(1000);	
			driver.findElement(By.xpath("//input[@placeholder='Enter User Name']")).sendKeys("abcdefghh");
			Thread .sleep(1000);	
			driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[13]/div/div/button")).click();
			Thread .sleep(1000);	
			driver.findElement(By.xpath("//textarea[@placeholder='Enter Address']")).sendKeys("abcdgh ,415,dsp road pune");
			Thread .sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
			Thread .sleep(3000);
			//update record
			driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[1]/i")).click();
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
			driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]/div/button[2]/i")).click();
			Thread .sleep(1000);
			driver.switchTo().alert().accept();
			Thread .sleep(3000);
    	
    } 
       @Test 
         public void Claim_Rej() throws Exception
         {
    	   driver.get("http://trti.mahamining.com/login");
    		driver.manage().window().maximize();
    		driver.findElement(By.xpath("//*[@id=\"home_login\"]")).click();
    		Thread .sleep(1000);
    		//Admin login
    		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("admin");
    	   Thread .sleep(1000);
    		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("admin");
    	    Thread .sleep(1000);	
    		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[4]/button")).click();
    		Thread .sleep(1000);
    		// master selection
    		driver.findElement(By.xpath("//*[@id=\"heading1\"]/button/div/div[2]")).click();
    		Thread .sleep(1000);
    		// claim rej   sel
    		driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/ul/li[7]/a")).click();
    		Thread .sleep(1000);   
    		//click on select commit
    		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-claim-rejection-remark/div/div/div/div/div[1]/form/div/div/div[1]/div[1]/div/ngx-select/div/div[2]/div")).click();
    		Thread .sleep(1000);  
    		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-claim-rejection-remark/div/div/div/div/div[1]/form/div/div/div[1]/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
    		Thread .sleep(1000);  
    		//Enter rej .title
    		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-claim-rejection-remark/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/input")).sendKeys("DVLCdemo");
    		Thread .sleep(1000);  
    		//enter description
    		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-claim-rejection-remark/div/div/div/div/div[1]/form/div/div/div[1]/div[3]/div/textarea")).sendKeys("KEVAL VANvibhaganes nakaratmak decision dila");
    		Thread .sleep(1000);  
    		//click on submit butt
    		driver.findElement(By.xpath("//*[@id=\"content\"]/app-claim-rejection-remark/div/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
    		Thread .sleep(1000); 
    		driver.findElement(By.xpath("//*[@id=\"content\"]/app-claim-rejection-remark/div/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[5]/div/button[1]")).click();
    		Thread .sleep(1000);
    		driver.findElement(By.xpath("// input[@ placeholder='Enter Rejection Title']")).clear();
    		Thread .sleep(1000);
    		driver.findElement(By.xpath("// input[@ placeholder='Enter Rejection Title']")).sendKeys("DLC Edited");
    		Thread .sleep(1000);
    		//update record
    		driver.findElement(By.xpath("//*[@id=\"content\"]/app-claim-rejection-remark/div/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
    		Thread .sleep(3000);
    		//delete record
    		driver.findElement(By.xpath("//*[@id=\"content\"]/app-claim-rejection-remark/div/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[5]/div/button[2]/i")).click();
    		Thread .sleep(1000);
    		driver.switchTo().alert().accept();
    		Thread .sleep(3000);
         }
       @Test 
       public void Designation() throws Exception 
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
   		//take a screenshot
   		Thread .sleep(3000); 
    	   
       }
       @Test 
       public void  Panchayat () throws Exception 
       {
    	  driver.get("http://trti.mahamining.com/login");
    		driver.manage().window().maximize();
    		driver.findElement(By.xpath("//*[@id=\"home_login\"]")).click();
    		Thread .sleep(1000);	
    		//admin login
    		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("admin");
    	     Thread .sleep(1000);
    		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("admin");
    	     Thread .sleep(1000);	
    		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[4]/button")).click();
    	   Thread .sleep(1000);
    	   //click on master
    		driver.findElement(By.xpath("//*[@id=\"heading1\"]/button/div/div[2]")).click();
    			//click on panchayat
    		driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/ul/li[1]/a")).click();
    		Thread .sleep(1000);
    		//enter panchayat all field
    		driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/ngx-select/div/div[2]/div")).click();
    		Thread .sleep(1000);
    	   driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[7]/a/span")).click();	
    	    Thread .sleep(1000);
    	   driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[3]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
    	    Thread .sleep(1000);
    	   driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();
    	    Thread .sleep(1000);
    	   driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[4]/div/ngx-select/div/div[2]/div")).click();
    	    Thread .sleep(1000);
    	   driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
    	    Thread .sleep(1000);
    	   driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[5]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
    	    Thread .sleep(1000);
    	   driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[5]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a")).click();
    	    Thread .sleep(1000);
    	   driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[6]/div/ngx-select/div/input")).click();
    	    Thread .sleep(1000);
    	   driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[7]/a")).click();
    	    Thread .sleep(1000);
    	   driver.findElement(By.xpath("//input[@placeholder='Enter Grampanchayat/Palika Name']")).sendKeys("Testgrampanchayat");
    	    Thread .sleep(1000);
    	    // click on submit button
    	   driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
    	    Thread .sleep(3000);
    	    // update record
    	   driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[7]/button[1]/i")).click();
    	    Thread .sleep(3000);
    	    //update record
    	   driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[7]/div/input")).clear();
    	    Thread .sleep(1000);
    	   driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[7]/div/input")).sendKeys("edittest");
    	    Thread .sleep(1000);
    	   driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
    	    Thread .sleep(1000);
    	    //delete record
    	   driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[7]/button[2]/i")).click();
    	    Thread .sleep(1000);
    	   driver.switchTo().alert().accept();
    	    Thread .sleep(3000);
    	    driver.close();
       }  
 
    }



