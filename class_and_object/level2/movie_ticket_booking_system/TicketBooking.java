package class_and_object.level2.movie_ticket_booking_system;

import java.util.ArrayList;
import java.util.List;

public class TicketBooking {

    List<Seats> seats;
    String MovieName;
    int price;
    int capacity;
    public TicketBooking(String MovieName, int price, int capacity) {
        this.MovieName = MovieName;
        this.price = price;
        this.capacity = capacity;
        this.seats = new ArrayList<>();
        for (int i = 1; i <= capacity; i++) {
            seats.add(new Seats(i));
        }
    }
        public String bookTicket(String passangerName){
            if(capacity <= 0)return "No Seats Available";
            for(Seats seat : seats){
                if(!seat.isBooked()){
                    seat.bookSeat();
                    capacity--;
                    return ("Ticket Booked For " + passangerName + "| seat Number: " + seat.getSeatNumber());
                }
            }

            return "No Seats Available";
        }
    public int AvailableSeats(){
        return capacity;
    }
}
