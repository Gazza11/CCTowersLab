import java.util.ArrayList;

public class DiningRoom extends Room{

    private String name;
    private ArrayList<Guest> guests;

    public DiningRoom(RoomType roomType, String name) {
        super(roomType);
        this.name = name;
        this.guests = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuest(){
        this.guests.remove(0);
    }

    public int getTotalGuests(){
        return guests.size();
    }

}
