package all_testes;

import org.testng.annotations.Test;

import com.microsoft.playwright.options.SelectOption;

import base.Base;

public class Test_Created_Order extends Base {
	
	@Test

	public static void testCreatedOrder() throws InterruptedException {

		page.navigate("https://dailyneed.prodevsltd.xyz/");
	
		click("//body/div[@class='main-wrapper']/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[2]");
		Thread.sleep(5000);
		
		page.locator("//input[@id = 'customer_name']").fill("Anamul Haque Biazid");
		Thread.sleep(3000);
		page.locator("//input[@id = 'customer_phone']").fill("01628083476");
		
		Thread.sleep(3000);
		page.locator("//textarea[@id = 'customer_address']").fill("Ixelles,Brussels,Belgium");
		//Thread.sleep(3000);
		//page.locator("//select[@id = 'shipping_method']/option[@value = '2']").click();
		page.locator("//select[@id = 'shipping_method']").selectOption(new SelectOption().setIndex(1));
		
		Thread.sleep(3000);
		click("//button[@class = 'btn btn-success w-100 mb-2']");
		
		
		
		
		
		
		

	}

}
