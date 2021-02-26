package workshop2;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HotelReservationUC2Test {
	static HotelReservationUC2 hotelReservation;

	@BeforeClass
	public static void initialize() {
		hotelReservation = new HotelReservationUC2();
	}

	@Before
	public void shouldPrintWelcomeMessage() {
		hotelReservation.printWelcomeMessage();
	}

	@Test
	public void givenDate_shouldReturn_CheapestHotelNameAndRate() throws Exception {
		hotelReservation.addHotelDetails();
		ArrayList<String> hotelNameList = hotelReservation.calculateCheapestHotelAndRate("2020-09-10", "2020-09-11");
		Object[] hotelName = hotelNameList.toArray();
		Object[] arrayExpectedOutput = { "LakeWood", "BridgeWood" };
		Assert.assertArrayEquals(arrayExpectedOutput, hotelName);
	}
}