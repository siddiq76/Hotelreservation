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
	public void givenDate_WeekDayshouldReturn_CheapestHotelNameBridgeWood() throws Exception {
		hotelReservation.addHotelDetails();
		ArrayList<String> hotelNameList = hotelReservation.calculateCheapestHotelAndRate("2020-09-14", "2020-09-16");
		Object[] hotelName = hotelNameList.toArray();
		Object[] arrayExpectedOutput = { "LakeWood" };
		Assert.assertArrayEquals(arrayExpectedOutput, hotelName);
	}

	@Test
	public void givenDateWeekend_shouldReturn_CheapestHotelNameBrideWood() throws Exception {
		hotelReservation.addHotelDetails();
		ArrayList<String> hotelNameList = hotelReservation.calculateCheapestHotelAndRate("2020-09-12", "2020-09-13");
		Object[] hotelName = hotelNameList.toArray();
		Object[] arrayExpectedOutput = { "BridgeWood" };
		Assert.assertArrayEquals(arrayExpectedOutput, hotelName);
	}

	@Test
	public void givenDateWeekDayWeekend_shouldReturn_CheapestHotelNameGivesBridgeWood() throws Exception {
		hotelReservation.addHotelDetails();
		ArrayList<String> hotelNameList = hotelReservation.calculateCheapestHotelAndRate("2020-09-11", "2020-09-12");
		Object[] hotelName = hotelNameList.toArray();
		Object[] arrayExpectedOutput = { "BridgeWood" };
		Assert.assertArrayEquals(arrayExpectedOutput, hotelName);
	}

}