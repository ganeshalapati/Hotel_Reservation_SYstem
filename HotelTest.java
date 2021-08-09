import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
class HotelTest {

	@Test
	
		public void givendetailsOf3Hotels_WhenAddedToHotelList_SizeOfListIs3() {

			Hotel_Reservation_SYstem.addHotel("Lakewood", 110);
			Hotel_Reservation_SYstem.addHotel("Bridgewood", 160);
			Assert.assertEquals(2,Hotel_Reservation_SYstem.countNoOfHotels());	

}
}