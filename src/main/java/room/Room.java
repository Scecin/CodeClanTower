package room;

import guest.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guestList;
    private double nightlyRate;

    public Room(int capacity, double nightlyRate) {
        this.capacity = capacity;
        this.guestList = new ArrayList<Guest>();
        this.nightlyRate = nightlyRate;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public ArrayList getGuestList() {
        return this.guestList;
    }

    public void addGuest(Guest guest) {
        this.guestList.add(guest);
    }

    public int getNumberOfGuests() {
        return this.guestList.size();
    }

    public void removeGuest(Guest guest) {
        this.guestList.remove(guest);
    }

    public double getNightlyRate() {
        return this.nightlyRate;
    }

    public static double getRoomSize(double width, double length) {
        return width * length;

    }
}
