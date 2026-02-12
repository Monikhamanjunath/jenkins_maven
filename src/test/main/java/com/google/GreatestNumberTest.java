package com.google;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreatestNumberTest {

    @Test
    void testFindGreatest() {
        GreatestNumber gn = new GreatestNumber();
        assertEquals(20, gn.findGreatest(10, 20, 15));
    }
}
