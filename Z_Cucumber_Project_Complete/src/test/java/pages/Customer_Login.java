package pages;

import org.testng.annotations.Test;

import base.Base;

public class Customer_Login extends Base {
	
	 @Test
  public static void Customer_Access() throws InterruptedException {
	  
	   page.navigate("https://dailyneed.prodevsltd.xyz"); 
	   
		System.out.println(page.title());
		click("//a[@class='sign-in-btn']");
		Thread.sleep(5000);
		page.locator("//input[@id = 'email_phone']").fill("tarek12345@gmail.com");
		page.locator("//input[@id = 'password']").fill("Tarek746@");
		Thread.sleep(5000);
		page.locator("//button[@class = 'btn w-100 sign-in-btn']").click();
		Thread.sleep(5000);  
}
}
