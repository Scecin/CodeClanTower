package room;

public class BedRoom extends Room {

    private int roomNumber;
    private RoomType roomType;

    public BedRoom(int roomNumber, RoomType roomType) {
        super(roomType.getCapacity(), roomType.getNightlyRate());
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
