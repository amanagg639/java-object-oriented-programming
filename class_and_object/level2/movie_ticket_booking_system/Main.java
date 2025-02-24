package class_and_object.level2.movie_ticket_booking_system;

public class Main {
    public static void main(String[] args) {
        TicketBooking movie = new TicketBooking("Interstellar", 500, 2);
        System.out.println(movie.bookTicket("Aman"));
        System.out.println(movie.bookTicket("Yugam"));
        System.out.println(movie.bookTicket("Aditya"));
        System.out.println(movie.AvailableSeats());
    }
}
