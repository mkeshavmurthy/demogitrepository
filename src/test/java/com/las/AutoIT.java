package com.las;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoIT 
{
	@Test
	public void demo() throws InterruptedException, IOException
	{	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("file:///C:/Users/Admin/eclipse-workspace/html5/AutoIT.html");

		d.findElement(By.name("resume")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\AutoIT\\fileupload.exe");
		
		
	}

	
}
