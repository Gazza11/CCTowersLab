public class Booking{

    private int nightsBooked;
    private Bedroom bedroom;

    public Booking(Bedroom bedroom, int nightsBooked) {
        this.bedroom = bedroom;
        this.nightsBooked = nightsBooked;
    }

    public int getNightsBooked() {
        return nightsBooked;
    }

    public int getRoomNumber() {
        return bedroom.getRoomNumber();
    }

    public RoomType getRoomType() {
        return bedroom.getRoomType();
    }

    public double getTotalCost(){
        return bedroom.getPerNights() * nightsBooked;
    }
}
