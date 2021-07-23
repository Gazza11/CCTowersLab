import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    Guest guest1;
    DiningRoom diningRoom;
    HashMap<String, DiningRoom> diningRooms;


    Booking booking;
    Booking booking2;

   @Before
    public void before(){
       bedroom1 = new Bedroom(RoomType.DOUBLE, 69, 28.50);
       bedroom2 = new Bedroom(RoomType.DOUBLE, 68, 20);
       bedroom3 = new Bedroom(RoomType.SINGLE, 1, 2);
       bedroom4 = new Bedroom(RoomType.SINGLE, 2, 34.00);
       bedrooms = new ArrayList<>();
       bedrooms.add(bedroom1);
       bedrooms.add(bedroom2);
       bedrooms.add(bedroom3);
       bedrooms.add(bedroom4);
       conferenceRoom1 = new ConferenceRoom(RoomType.CONFERENCE,"Booty Pong");
       conferenceRoom2 = new ConferenceRoom(RoomType.CONFERENCE, "Ping Pump");
       conferenceRooms = new ArrayList<>();
       conferenceRooms.add(conferenceRoom1);
       conferenceRooms.add(conferenceRoom2);
       diningRoom = new DiningRoom(RoomType.DININGROOM, "Big Room");
       diningRooms = new HashMap<>();
       diningRooms.put(diningRoom.getName(), diningRoom);
       hotel = new Hotel(bedrooms, conferenceRooms, "Hotel Capacity", diningRooms);
       guest1 = new Guest("Steve");
       booking = new Booking(bedroom1, 2);
   }

   @Test
    public void canCheckIn(){
       hotel.checkInGuest(bedroom1, guest1);
       assertEquals(1, bedroom1.getNumberOfPeopleInRoom());
   }

   @Test
    public void canCheckOut(){
       hotel.checkInGuest(bedroom1, guest1);
       hotel.checkOutGuest(bedroom1);
       assertEquals(0, bedroom1.getNumberOfPeopleInRoom());
   }

   @Test
    public void canCreateBooking(){
       booking2 = hotel.bookRoom(bedroom1, 2);
       assertEquals(2, booking2.getNightsBooked());
       assertEquals(RoomType.DOUBLE, booking2.getRoomType());
       assertEquals(69, booking2.getRoomNumber());
   }

   @Test
    public void canGetDiningRoomType(){
       assertEquals(RoomType.DININGROOM, hotel.getDiningRoomType("Big Room"));
   }

   @Test
    public void getVancantList(){
       assertEquals(4, hotel.getVacantList().size());
   }

   @Test
    public void GetVacantRoomsTwo(){
       hotel.checkInGuest(bedroom1, guest1);
       hotel.checkInGuest(bedroom2, guest1);
       assertEquals(2, hotel.getVacantList().size());
   }
}
