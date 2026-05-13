package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testSum() {
        App app = new App();
        assertEquals(15, App.sum(5, 10));
    }
}
