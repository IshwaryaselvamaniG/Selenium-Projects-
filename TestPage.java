package FlightBooking;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPage {
	WebDriver driver;

	@BeforeClass
	public void fetch_window() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10 ));
		driver.get("https://www.dummyticket.com/");
	}

	@Test
	public void flightbooking() throws InterruptedException {
		PageModel pg = new PageModel(driver);

		//		click buy tickets
		pg.clickto_redirect_tickpage();

		//		scroll
		pg.scroll();

		//		passengar name 
		pg.passenger_firstname("ishwarya");
		pg.passenger_lastname("selvamani");

		//		passenger dob
		pg.passsenger_dob();
		pg.passenger_dobyear("1993");
		pg.passenger_datepicker();

		//		gender
		pg.select_gender();

		//		trip
		pg.trip_from_city("Madurai");
		pg.trip_to_city("Chennai");

		//		departure date 
		pg.departure_date_enter();
		pg.departure_date_enter();

		//     additional details
		pg.additional_details("Alternate dates are not recommended");

		//		scroll2
		pg.scroll2();

		//		delivery
		pg.delivery_option();
		pg.delivery_option();
		pg.delivery_option();

		//		billing 
		pg. billing_details_name("ishwarya");
		pg.billing_details_mobilenumber("9685968577");
		pg. billing_details_email("ishu@gmail.com");
		pg. billing_details_address("Alagappa nagar");
		pg. billing_details_address2("Brownstudio appartment");
		pg.billing_details_city("Guindy");

		//		scrollfunct3
		pg.scroll_function3();

		//		state
		pg.state("Tamil");

		//		pin
		pg.pincode("600097");

		//		placeorder
		pg.place_order();
	

		//		cancel payment
		pg.cancel_payment();
		pg.cancel_payment2();


}

	@AfterClass
	void tearDown()
	{
				driver.quit();
	}
}



