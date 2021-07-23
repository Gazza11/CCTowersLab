import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE, 69, 28.50);
        guest1 = new Guest("Steve");
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void hasRoomCapacity(){
        assertEquals(2, bedroom.getCapacityFromRoomType());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(69, bedroom.getRoomNumber());
    }

    @Test
    public void addGuest(){
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.getNumberOfPeopleInRoom());
    }

    @Test
    public void removeGuest(){
        bedroom.addGuest(guest1);
        bedroom.removeGuest();
        assertEquals(0, bedroom.getNumberOfPeopleInRoom());
    }
}
