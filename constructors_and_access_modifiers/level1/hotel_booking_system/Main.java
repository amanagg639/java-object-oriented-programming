package constructors_and_access_modifiers.level1.hotel_booking_system;

public class Main {
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking("Aman", "Single", 3);
        HotelBooking booking2 = new HotelBooking(booking1);
        System.out.println(booking2.guestName);
    }
}
