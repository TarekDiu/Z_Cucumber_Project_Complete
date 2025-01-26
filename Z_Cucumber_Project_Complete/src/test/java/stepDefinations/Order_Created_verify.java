package stepDefinations;

import com.microsoft.playwright.options.SelectOption;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Order_Created_verify extends Base {
	
	@Given("a registered customer is logged into the website")
	public void a_registered_customer_is_logged_into_the_website() {
		page.navigate("https://dailyneed.prodevsltd.xyz");
	}

	@Given("the customer has added products to the cart")
	public void the_customer_has_added_products_to_the_cart() {
		click("//body/div[@class='main-wrapper']/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[2]");
	}

	@Then("the customer put it her name in the name field")
	public void the_customer_put_it_her_name_in_the_name_field() {
		page.locator("//input[@id = 'customer_name']").fill("Anamul Haque Biazid");
	}

	@Then("the customer put it her Phone number in Phone number field")
	public void the_customer_put_it_her_phone_number_in_phone_number_field() {
		page.locator("//input[@id = 'customer_phone']").fill("01628083476");
	}

	@Then("the customer put it her address in the address  field")
	public void the_customer_put_it_her_address_in_the_address_field() {
		page.locator("//textarea[@id = 'customer_address']").fill("Ixelles,Brussels,Belgium");
	}

	@Then("the customer click the shipping method")
	public void the_customer_click_the_shipping_method() {
		page.locator("//select[@id = 'shipping_method']").selectOption(new SelectOption().setIndex(1));
	}

	@Then("the customer complete the order click submit button")
	public void the_customer_complete_the_order_click_submit_button() {
		click("//button[@class = 'btn btn-success w-100 mb-2']");
	}


}
