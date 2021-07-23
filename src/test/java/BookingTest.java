import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(RoomType.DOUBLE, 88, 35.45);
        booking = new Booking(bedroom1, 2);
    }

    @Test
    public void checkNightsBooked(){
        assertEquals(2, booking.getNightsBooked());
    }

    @Test
    public void checkRoomNumber(){
        assertEquals(88, booking.getRoomNumber());
    }

    @Test
    public void checkRoomType(){
        assertEquals(RoomType.DOUBLE, booking.getRoomType());
    }

    @Test
    public void checkTotalCost(){
        assertEquals(70.90, booking.getTotalCost(), 0.01);
    }

}
