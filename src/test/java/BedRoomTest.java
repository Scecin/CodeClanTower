import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import room.BedRoom;
import room.RoomType;

import static org.junit.Assert.*;

public class BedRoomTest {

    BedRoom bedRoom;
    Guest guest;

    @Before
    public void before() {
        bedRoom = new BedRoom(RoomType.FAMILY.getCapacity(), 120, RoomType.FAMILY);
    }

    @Test
    public void hasCapacity() {
        assertEquals(6, bedRoom.getCapacity());
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(120, bedRoom.getRoomNumber());
    }

    @Test
    public void hasRoomType() {
        assertEquals(RoomType.FAMILY, bedRoom.getRoomType());
    }

    @Test
    public void canAddGuestToRoom() {
        Guest guest1 = new Guest("Silvia");
        Guest guest2 = new Guest("Sandra");
        Guest guest3 = new Guest("Rachel");
        Guest guest4 = new Guest("Mary");
        bedRoom.addGuest(guest1);
        bedRoom.addGuest(guest2);
        bedRoom.addGuest(guest3);
        bedRoom.addGuest(guest4);
        //System.out.println(bedRoom.getGuestList();
        assertEquals(4, bedRoom.getNumberOfGuests());
    }

    @Test
    public void canRemoveGuestToRoom() {
        Guest guest1 = new Guest("Silvia");
        Guest guest2 = new Guest("Sandra");
        bedRoom.addGuest(guest1);
        bedRoom.addGuest(guest2);
        bedRoom.removeGuest(guest1);
        assertEquals(1, bedRoom.getNumberOfGuests());


    }

}