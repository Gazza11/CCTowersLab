import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    protected ArrayList<Guest> guests;

    public Room(RoomType roomType){
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public ArrayList getGuests(){
        return guests;
    }

    public int getCapacityFromRoomType(){
        return roomType.getCapacity();
    }

    public int getNumberOfPeopleInRoom(){
        return this.guests.size();
    }

}
