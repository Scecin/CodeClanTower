package hotel;

import guest.Guest;
import room.BedRoom;
import room.ConferenceRoom;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<BedRoom> bedRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<BedRoom> bedRooms,ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedRooms = bedRooms;
        this.conferenceRooms = conferenceRooms;
    }

    public int getNumberOfBedRooms() {
        return this.bedRooms.size();
    }

    public int getNumberOfConferenceRooms() {
        return  this.conferenceRooms.size();
    }


    public void checkIn(Guest guest, BedRoom bedRoom) {
        bedRoom.addGuest(guest);
    }

    public int getNumberOfGuests(BedRoom bedRoom) {
        return bedRoom.getNumberOfGuests();
    }

    public void checkOut(Guest guest, BedRoom bedRoom) {
        bedRoom.removeGuest(guest);
    }

    public Booking bookRoom(Booking booking) {
        return booking;
    }
}
