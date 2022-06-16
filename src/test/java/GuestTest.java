import guest.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuestTest {

    Guest guest;

    @Before
    public void before() {
        guest = new Guest("David");
    }

    @Test
    public void hasName() {
        assertEquals("David", guest.getName());
    }

}