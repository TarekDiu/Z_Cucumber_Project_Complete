package base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Properties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page.ScreenshotOptions;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

@Listeners(utility.ListenersClass.class)
public class Base {
	public static Playwright playwright;
	public static Browser browser;
	public static Page page;
	public static Properties properties;
	public static FileInputStream fileinputstream;
	
	@BeforeMethod
	public static void startUp() throws IOException {
		
		properties = new Properties(); 
		try {
			fileinputstream = new FileInputStream("./src/main/resources/properties/acd.properties");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		  try {
			  properties.load(fileinputstream);
		  }catch(IOException e) {
			  e.printStackTrace();
		  }		
	}

	public static String innerText(String xpath) {
		String s = page.locator(xpath).innerText();
		return s;
	}

	public static  void fill(String xpath, String value) {
		page.locator(xpath).fill(value);
	}

	public static void navigate(String url) {
		page.navigate(url);
	}

//	public static void click(Locator locator) {
//		locator.click();
//	}
	
	
	public static void click(String xpath) {
		page.locator(xpath).click();
		
	}

	public static void selectOption(String xpath, String value) {
		page.selectOption(xpath, value);
	}

	public static void assertion(String xpath, String text) {
		assertThat(page.locator(xpath)).hasText(text);
	}

	public static int generateNumber() {
		return (int) (Math.random() * 1000000);
	}

	public static void generateScheenshot(String filename) {
		ScreenshotOptions ssOptions = new ScreenshotOptions();
		page.screenshot(ssOptions.setPath(Paths.get(filename)));

	}
	
	

	@AfterMethod
	public static void close() {

		page.close();
		browser.close();
		playwright.close();
	}
}