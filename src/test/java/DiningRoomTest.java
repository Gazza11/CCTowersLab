import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Steve");
        diningRoom = new DiningRoom(RoomType.DININGROOM, "Big Room");
    }

    @Test
    public void hasName(){
        assertEquals("Big Room", diningRoom.getName());
    }

    @Test
    public void canAddGuest(){
        diningRoom.addGuest(guest1);
        assertEquals(1, diningRoom.getTotalGuests());
    }

    @Test
    public void canRemoveGuest(){
        diningRoom.addGuest(guest1);
        diningRoom.removeGuest();
        assertEquals(0, diningRoom.getTotalGuests());
    }

}
