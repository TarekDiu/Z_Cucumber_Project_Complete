package stepDefinations;
import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Customer_Login_Verified extends Base {

	@Given("Firstly Customer in the home page")
	public void firstly_customer_in_the_home_page() {
		page.navigate("https://dailyneed.prodevsltd.xyz");
		System.out.println(page.title());
	}

	@Then("Customer click the sign in button")
	public void customer_click_the_sign_in_button() {
		click("//a[@class='sign-in-btn']");
	}

	@Then("Customer put it her Email")
	public void customer_put_it_her_email() {
		page.locator("//input[@id = 'email_phone']").fill("tarek12345@gmail.com");
	}

	@Then("Customer put it her password")
	public void customer_put_it_her_password() {
		page.locator("//input[@id = 'password']").fill("Tarek746@");
	}

	@Then("Customer click the submit button")
	public void customer_click_the_submit_button() {
		page.locator("//button[@class = 'btn w-100 sign-in-btn']").click();
	}

}
