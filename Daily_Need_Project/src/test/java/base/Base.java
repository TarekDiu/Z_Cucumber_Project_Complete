package base;

import java.nio.file.Paths;
import java.util.ArrayList;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Base {

	public static Page page;

	@BeforeSuite // then no need methode callin all project

	public static void startUp() {
		String chromePath = "c:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		Playwright playwright;
		playwright = Playwright.create();

		ArrayList<String> arguments = new ArrayList<>();
		arguments.add("--start-maximized");

		LaunchOptions launchOptions;
		launchOptions = new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments)
				.setExecutablePath(Paths.get(chromePath));

		Browser browser;
		browser = playwright.chromium().launch(launchOptions);

		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
		page = context.newPage();
	}

	@AfterSuite

	// public static void shut(){
	// System.out.println("tarek");
	// page.close();
	// }

	// print method

	public static void print(String s) {
		System.out.println(s);
	}

	// get any filed attribute

	public static String hasText(String locator, String Key) {
		return page.locator(locator).getAttribute(Key);
	}

	// CLick Method
	public static void click(String locator) {
		page.locator(locator).click();
	}

	// navigate method
	public static void navigate(String n) {
		page.navigate(n);
	}

	// fill method
	public static void fill(String locator, String value) {
		page.locator(locator).fill(value);
	}

	public static String innerText(String locator) {
		String s = page.locator(locator).innerText();
		return s;
	}

}
