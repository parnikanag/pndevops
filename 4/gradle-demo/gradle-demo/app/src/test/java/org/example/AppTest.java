package gradle.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAdd() {
        assertEquals(11, App.add(5, 6));
    }
}
