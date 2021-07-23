
public class Bedroom extends Room {

    private int roomNumber;
    private double costPerNight;
    private boolean notVacant;

    public Bedroom(RoomType roomType, int roomNumber, double costPerNight) {
        super(roomType);
        this.roomNumber = roomNumber;
        this.costPerNight = costPerNight;
        this.notVacant = false;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public void addGuest(Guest guest){
        if(notVacant == false){
            this.guests.add(guest);
            this.notVacant = true;
        }

    }

    public void removeGuest(){
        if( notVacant == true){
            this.guests.remove(0);
            this.notVacant = false;
        }

    }

    public double getPerNights(){
        return costPerNight;
    }

    public boolean getVacancy(){
        return this.notVacant;
    }

}
