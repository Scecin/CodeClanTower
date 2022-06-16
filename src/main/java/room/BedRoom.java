package room;

public class BedRoom extends Room {

    private int roomNumber;
    private RoomType roomType;

    public BedRoom(int capacity, int roomNumber, RoomType roomType) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return  this.roomNumber;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }
}
