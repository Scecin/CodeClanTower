package hotel;

import org.junit.Before;
import org.junit.Test;
import room.BedRoom;
import room.RoomType;

import static org.junit.Assert.*;

public class BookingTest {

    Booking booking;
    BedRoom bedRoom;

    @Before
    public void before() {
        bedRoom = new BedRoom(1, RoomType.FAMILY);
        booking = new Booking(5, bedRoom);
    }

    @Test
    public void hasNumberOfNights() {
        assertEquals(5, booking.getNumberOfNights());
    }

    @Test
    public void hasBedRoom() {
        assertEquals(bedRoom, booking.getBedRoom());
    }

    @Test
    public void canTotalBillBooking() {
        assertEquals(2500.0, booking.getTotalBill(), 0.0);
    }

}