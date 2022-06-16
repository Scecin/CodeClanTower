package room;

public class ConferenceRoom extends Room{

    private String name;
    private String eventType;

    public ConferenceRoom(int capacity, String name, String eventType) {
        super(capacity);
        this.name = name;
        this.eventType = eventType;
    }

    public String getName() {
        return this.name;
    }

    public String getEventType() {
        return this.eventType;
    }
}
