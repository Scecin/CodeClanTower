package hotel;

import room.BedRoom;

public class Booking {

    private int numberOfNights;
    BedRoom bedRoom;

    public Booking(int numberOfNights, BedRoom bedRoom) {
        this.numberOfNights = numberOfNights;
        this.bedRoom = bedRoom;
    }


    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public BedRoom getBedRoom() {
        return this.bedRoom;
    }

    public double getTotalBill() {
        return  this.bedRoom.getNightlyRate() * numberOfNights;
    }
}
