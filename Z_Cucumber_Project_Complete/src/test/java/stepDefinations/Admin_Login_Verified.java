package stepDefinations;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Admin_Login_Verified extends Base {

	
	@Given("Firstly Admin go the admin panel page")
	public void firstly_admin_go_the_admin_panel_page() {
		page.navigate("https://dailyneed.prodevsltd.xyz/admin-login");
		System.out.println(page.title());
	}

	@Then("after he put it her email in email field")
	public void after_he_put_it_her_email_in_email_field() {
		page.locator("//input[@id = 'email']").fill("admin@gmail.com");
	}

	@Then("then he put it her password in pass filed")
	public void then_he_put_it_her_password_in_pass_filed() {
		page.locator("//input[@id = 'password']").fill("admin12345");
	}

	@Then("finally he click the submit button and finished")
	public void finally_he_click_the_submit_button_and_finished() {
		page.locator("//button[@class = 'btn btn-primary btn-lg btn-block']").click();
	}


}
