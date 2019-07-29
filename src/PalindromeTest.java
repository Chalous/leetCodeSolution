import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void testOne(){
        Palindrome p=new Palindrome();
        assertTrue("a",p.isPalindrome(121));
        assertFalse("b",p.isPalindrome(-121));
        assertFalse("c",p.isPalindrome(10));
    }
}
