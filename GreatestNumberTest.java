import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GreatestNumberTest {

    @Test
    public void testFindGreatest() {
        GreatestNumber gn = new GreatestNumber();
        assertEquals(20, gn.findGreatest(10, 20, 15));
    }
}
