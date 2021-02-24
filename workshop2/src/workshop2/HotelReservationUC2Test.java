package workshop2;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class HotelReservationUC2Test 
{
	static HotelReservationUC2 hotelReservation;
	@BeforeClass
	public static void initialize() {
		hotelReservation = new HotelReservationUC2();
	}
	
	@Test
	public void shouldPrintWelcomeMessage()  {
		HotelReservationUC2 hotelReservation = new HotelReservationUC2();
		hotelReservation.printWelcomeMessage();
	}
	
	 @Test
     public void givenDate_shouldReturnLakeWood()throws Exception {
         HotelReservationUC2 hotelReservation = new HotelReservationUC2();
         hotelReservation.addHotelDetails();
         String cheapestHotel = hotelReservation.calculateCheapestHotelAndRate("10Sep2020", "11Sep2020");
         Assert.assertEquals("Lakewood", cheapestHotel);
     }
}
