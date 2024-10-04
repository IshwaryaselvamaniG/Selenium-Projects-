package FlightBooking;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;



public class PageModel {

	WebDriver driver;

//constructor
	PageModel(WebDriver driver)
	{
	  this.driver = driver;	
	}
	
//	locators -
	By btn_click_redirect_ticketpage = By.xpath("//li[@id=\"menu-item-574\"]");
		
//	scroll
	By scroll_function_btn = By.xpath("//h3[text()='Passenger details:']");
	
//	passengar name 
	By txt_first_name = By.xpath("//input[@id=\"travname\"]");
	By txt_last_name = By.xpath("//input[@id=\"travlastname\"]");
	
	
//	passengar DOB
	By btn_dob_select = By.xpath("//input[@id=\"dob\"]");
	By btn_datepicker_select = By.xpath("//select[@class=\"ui-datepicker-year\"]");
	By btn_date3_pick = By.xpath("//a[@data-date=\"3\"]");
	
//	gender
	By btn_choose_female = By.xpath("//input[@id=\"sex_2\"]");
	
//	trip details from to 
	By txt_from_enter = By.xpath("//input[@id=\"fromcity\"]");
	By txt_to_enter = By.xpath("//input[@id=\"tocity\"]");
	
//	departure date 
	By btn_click_box = By.xpath("//input[@id=\"departon\"]");
	By btn_pick_date = By.xpath("//a[@data-date=\"30\"]");
	
//	additional details
	By txt_enter_details = By.xpath("//textarea[@id=\"notes\"]");
	
//	scroll2
	By scroll_function2 = By.xpath("//h2[text()='Billing Details']");
	
//	delivery option
	By btn_delivery_details = By.xpath("//input[@id=\"appoinmentdate\"]");
	By btn_delivery_details2 = By.xpath("//a[@data-date=\"29\"]");
    By btn_delivery_details3 = By.xpath("//input[@id=\"deliverymethod_3\"]");

//  billing details 
    By txt_bill_name = By.xpath("//input[@name=\"billname\"]");
    By txt_mobile_number = By.xpath("//input[@type=\"tel\"]");
    By txt_email_id = By.xpath("//input[@type=\"email\"]");
    By txt_address_details = By.xpath("//input[@id=\"billing_address_1\"]");
    By txt_address_details2 = By.xpath("//input[@id=\"billing_address_2\"]");
	By txt_city_details = By.xpath("//input[@id=\"billing_city\"]");
	
//	scroll3
	By scroll_function3 = By.xpath("//h3[text()='Your order']");

//	state
	By txt_state_details = By.xpath("//span[text()='Select an option…']");
	By drop_down = By.xpath("//input[@class=\"select2-search__field\"]");

//	pincode
	By txt_pincode_details = By.xpath("//input[@id='billing_postcode']");

//	place order
	By btn_click_placeorder = By.xpath("//button[@id=\"place_order\"]");
	
////	cancel payment 
	By btn_payment_click = By.xpath("//i[@class=\"back\"]");
	By btn_payment2_click = By.xpath("//button[text()=\"YES, CANCEL\"]");
	

	
//Action Method
	
	public void clickto_redirect_tickpage() {
		driver.findElement( btn_click_redirect_ticketpage).click();
	}
	public void scroll() 
	{
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		WebElement scroll1 = driver.findElement(scroll_function_btn);
		js.executeScript("window,scrollBy(0,250)");
		
	}
	public void passenger_firstname(String name) 
	{
		driver.findElement(txt_first_name).sendKeys(name);
	}
	
	public void passenger_lastname(String name) 
	{
		
		driver.findElement(txt_last_name).sendKeys(name);
	}
	
//	date picker
	public void passsenger_dob() 
	{
		driver.findElement(btn_dob_select ).click();
	}
	public void passenger_dobyear(String date) 
	{
		WebElement datepick = driver.findElement(btn_datepicker_select);
		Select dob = new Select(datepick);
		dob.selectByValue(date);
	}
	public void passenger_datepicker() {
		
		driver.findElement(btn_date3_pick).click();
	}

	public void select_gender() {
		driver.findElement(btn_choose_female).click();
	}
	public void trip_from_city(String place) {
		driver.findElement(txt_from_enter).sendKeys(place);
	}
		public void trip_to_city(String place) {	
		driver.findElement( txt_to_enter ).sendKeys(place);
	}
	public void departure_date_enter() {
		driver.findElement(btn_click_box).click();
		driver.findElement( btn_pick_date).click();
	}
	public void additional_details(String additional) {
		driver.findElement(txt_enter_details).sendKeys(additional);
	}
	public void scroll2() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement scroll2 = driver.findElement(scroll_function2);
		js.executeScript("arguments[0].scrollIntoView(true)",scroll2);
	}
	public void delivery_option() {
		driver.findElement(btn_delivery_details).click();
		driver.findElement(btn_delivery_details2).click();
	    driver.findElement( btn_delivery_details3).click();
	}
	public void billing_details_name(String name) {
        driver.findElement(txt_bill_name ).sendKeys(name);
	}
	public void billing_details_mobilenumber(String mobilenumber) {
		driver.findElement(txt_mobile_number).sendKeys(mobilenumber);
	}
	public void billing_details_email(String email) {  
		 driver.findElement(txt_email_id).sendKeys(email);
	}
	public void billing_details_address(String address) {
		  driver.findElement(txt_address_details).sendKeys(address);
	}
	public void billing_details_address2(String address2) {
		 driver.findElement(txt_address_details2).sendKeys(address2);
	} 
	public void billing_details_city(String city) {  
        driver.findElement(txt_city_details).sendKeys(city);
	}
	public void scroll_function3() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement scroll3 = driver.findElement(scroll_function3 );
		js.executeScript("arguments[0].scrollIntoView(true)",scroll3);
	}
	public void state(String statename) throws InterruptedException {
		driver.findElement(txt_state_details ).click();
		Thread.sleep(3000);
		WebElement state =  driver.findElement(drop_down);
		state.sendKeys(statename);
		state.sendKeys(Keys.ENTER);
	}

	public void pincode(String pin) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(txt_pincode_details).sendKeys(pin);
	}
	public void place_order() {
		driver.findElement(btn_click_placeorder).click();
	}
	public void cancel_payment() throws InterruptedException {
		driver.findElement(btn_payment_click ).click();
		Thread.sleep(3000);
	}
	public void cancel_payment2() throws InterruptedException {
		
		driver.findElement(btn_payment2_click).click();
		Thread.sleep(15000);
	}

	
}