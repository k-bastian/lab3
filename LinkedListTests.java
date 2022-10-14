import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testAppend() {
        LinkedList linked = new LinkedList();
        linked.append(1);
        linked.append(2);
        linked.append(3);

        assertEquals(3, linked.last());
    }
}

