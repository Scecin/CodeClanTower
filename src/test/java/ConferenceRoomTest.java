import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import room.ConferenceRoom;

import static org.junit.Assert.*;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(90, "The Castle", "Social",0.0);
    }

    @Test
    public void hasCapacity() {
        assertEquals(90, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("The Castle", conferenceRoom.getName());
    }

    @Test
    public void hasEventType() {
        assertEquals("Social", conferenceRoom.getEventType());
    }

    @Test
    public void canAddGuestToRoom() {
        conferenceRoom.addGuest(guest = new Guest("Silvia"));
        conferenceRoom.addGuest(guest = new Guest("Sandra"));
        conferenceRoom.addGuest(guest = new Guest("Rachel"));
        conferenceRoom.addGuest(guest = new Guest("Mary"));
        //System.out.println(bedRoom.getGuestList();
        assertEquals(4, conferenceRoom.getNumberOfGuests());
    }

}