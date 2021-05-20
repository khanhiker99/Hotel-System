public class Receptionist extends User{
    private BookingSystem bookingSystem;


    public Receptionist(int id, String username, String password, double salary, BookingSystem bookingSystem) {
        super(id, username, password, salary);
        this.bookingSystem = bookingSystem;
    }



    public BookingSystem getBookingSystem() {
        return bookingSystem;
    }

    public void setBookingSystem(BookingSystem bookingSystem) {
        this.bookingSystem = bookingSystem;
    }



}
