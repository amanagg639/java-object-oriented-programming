package class_and_object.level2.movie_ticket_booking_system;

public class Seats {
    private int seatNumber;
    private boolean isBooked;
    public Seats(int seatNumber){
        this.seatNumber = seatNumber;
        isBooked = false;
    }
    public int getSeatNumber(){
        return seatNumber;
    }
    public boolean isBooked(){
        return isBooked;
    }
    public void bookSeat(){
        isBooked = true;
    }

}
