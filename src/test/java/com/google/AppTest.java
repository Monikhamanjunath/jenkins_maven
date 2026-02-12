package com.google;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testFirstIsGreatest() {
        App app = new App();
        assertEquals(10, app.findGreatest(10, 5, 3));
    }

    @Test
    void testSecondIsGreatest() {
        App app = new App();
        assertEquals(12, app.findGreatest(4, 12, 7));
    }

    @Test
    void testThirdIsGreatest() {
        App app = new App();
        assertEquals(20, app.findGreatest(8, 15, 20));
    }

    @Test
    void testAllEqual() {
        App app = new App();
        assertEquals(5, app.findGreatest(5, 5, 5));
    }
}
