import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private String name;
    private Booking bookingNumber;
    private HashMap<String, DiningRoom> diningRooms;
    private ArrayList<Bedroom> emptyBedrooms;

    public static void main(String[] args) {
        HashMap<String, DiningRoom> diningRooms = new HashMap<>();
    }


    public Hotel(ArrayList bedrooms, ArrayList conferenceRooms, String name, HashMap diningRooms){
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.name = name;
        this.diningRooms = diningRooms;

    }

    public int inRoom(Bedroom bedroom){
        return bedroom.getNumberOfPeopleInRoom();
    }


    public void checkInGuest(Bedroom bedroom, Guest guest){
        bedroom.addGuest(guest);
    }

    public void checkOutGuest(Bedroom bedroom){
        bedroom.removeGuest();
    }

    public Booking bookRoom(Bedroom bedroom, int nights){
        return bookingNumber = new Booking(bedroom, nights);
    }

//    public ArrayList getDiningRoomNames(String diningRoomName ){
//        return this.diningRooms.keySet();
//    }

    public RoomType getDiningRoomType(String diningRoomName) {
        return this.diningRooms.get(diningRoomName).getRoomType();
    }

    public ArrayList getVacantList(){
        emptyBedrooms = new ArrayList<Bedroom>();
        for(int i = 0; i < this.bedrooms.size(); i++){
            if(bedrooms.get(i).getVacancy() == false){
                emptyBedrooms.add(bedrooms.get(i));
            }
        }
        return emptyBedrooms;
    }
}
