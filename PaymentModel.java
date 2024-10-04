package FlightBooking;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentModel {
	WebDriver driver;

	//Constructor
	PaymentModel(WebDriver driver)
	{
		this.driver = driver;
	}

	// locators
	By txt_click_alloptions = By.xpath("//div[@data-testid='all-options-cta']");
	By scroll_function =By.xpath("//span[text()='Google Pay']");
	By btn_click_gpay = By.xpath("//img[@src='https://web-assets.payu.in/web/images/assets/misc/GPAY.svg']\"");
	By txt_upi_id = By.xpath("//input[@id=\"upi2Id\"]");
	By txt_verify_upiid = By.xpath("//button[@id=\"upi-verify-enabled\"]");
	By txt_proceed_click = By.xpath("//button[@id=\"procceed-upi-enabled\"]");

	//action methods

	public void click_show_alloptions() throws InterruptedException {
		driver.findElement(txt_click_alloptions).click();
	}
	public void scrollto_gpay_button() throws InterruptedException {
		Thread.sleep(2000);
		WebElement scroll = driver.findElement(scroll_function);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0,scrollIntoView(true)",scroll);

		scroll.click();
	}
	public void click_gapy() 
	{
		driver.findElement(btn_click_gpay).click();
	}

	public void enter_upi_button(String upi ) {
		driver.findElement(txt_upi_id).sendKeys(upi);
	}
	public void click_verify_button() {
		driver.findElement(txt_verify_upiid).click();
	}
	public void click_proceed_button() throws InterruptedException
	{
	
		driver.findElement(txt_proceed_click);
		Thread.sleep(5000);
	}



}