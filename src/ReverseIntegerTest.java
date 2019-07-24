import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseIntegerTest {
    @Test
    public void testOneInteger(){
        ReverseInteger i=new ReverseInteger();
        assertEquals("test 123",i.reverse(123),321);
    }
}
