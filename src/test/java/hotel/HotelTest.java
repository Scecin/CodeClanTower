package hotel;

import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import room.BedRoom;
import room.ConferenceRoom;
import room.RoomType;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HotelTest {

    Hotel hotel;
    BedRoom bedRoom1;
    ConferenceRoom conferenceRoom;
    ArrayList<BedRoom> bedRoomList;
    ArrayList<ConferenceRoom> conferenceRoomArrayList;


    @Before
    public void before() {
        bedRoom1 = new BedRoom(RoomType.SINGLE.getCapacity(), 1, RoomType.SINGLE);
        BedRoom bedRoom2 = new BedRoom(RoomType.DOUBLE.getCapacity(), 2, RoomType.DOUBLE);
        BedRoom bedRoom3 = new BedRoom(RoomType.PRESIDENTIAL.getCapacity(), 3, RoomType.PRESIDENTIAL);
        ConferenceRoom conferenceRoom1 = new ConferenceRoom(100, "The castle", "Social");
        ConferenceRoom conferenceRoom2 = new ConferenceRoom(50, "The Palace", "Business");
        bedRoomList = new ArrayList<BedRoom>();
        bedRoomList.add(bedRoom1);
        bedRoomList.add(bedRoom2);
        bedRoomList.add(bedRoom3);
        conferenceRoomArrayList = new ArrayList<ConferenceRoom>();
        conferenceRoomArrayList.add(conferenceRoom1);
        conferenceRoomArrayList.add(conferenceRoom2);
        hotel = new Hotel(bedRoomList, conferenceRoomArrayList);
    }

    @Test
    public void hasBedRooms() {
        assertEquals(3, hotel.getNumberOfBedRooms());
    }

    @Test
    public void hasConferenceRooms() {
        assertEquals(2, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canCheckInToBedRoom() {
        Guest guest = new Guest("Peter");
        hotel.checkIn(guest, bedRoom1);
        assertEquals(1, hotel.getNumberOfGuests(bedRoom1));
    }

    @Test
    public void canCheckOutToBedRoom() {
        Guest guest = new Guest("Peter");
        Guest guest2 = new Guest("Mary");
        hotel.checkIn(guest, bedRoom1);
        hotel.checkIn(guest2, bedRoom1);
        hotel.checkOut(guest, bedRoom1);
        assertEquals(1, hotel.getNumberOfGuests(bedRoom1));
    }


}