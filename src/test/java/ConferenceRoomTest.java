import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, "Booty Pong");
    }

    @Test
    public void hasRoomType(){
    assertEquals(RoomType.CONFERENCE, conferenceRoom.getRoomType());
    }

    @Test
    public void hasName(){
        assertEquals("Booty Pong", conferenceRoom.getName());
    }
}
