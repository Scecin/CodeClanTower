package room;

public enum RoomType {

    SINGLE(1,90.0),
    DOUBLE(2, 120.0),
    FAMILY(6, 500.0),
    PRESIDENTIAL(2, 1999.99);

    private final int capacity;
    private final double nightlyRate;


    RoomType(int capacity, double nightlyRate) {
        this.capacity = capacity;
        this.nightlyRate = nightlyRate;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getNightlyRate() {
        return this.nightlyRate;
    }
}
