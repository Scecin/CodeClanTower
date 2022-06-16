package room;

public enum RoomType {

    SINGLE(1),
    DOUBLE(2),
    FAMILY(6),
    PRESIDENTIAL(2);

    private final int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
