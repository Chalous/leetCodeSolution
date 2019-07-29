import org.junit.Test;
import static org.junit.Assert.*;

public class ValidParenthesesTest {
    @Test
    public void simpleOne(){
        ValidParentheses v=new ValidParentheses();
        assertTrue("()",v.isValid("()"));
        assertFalse("(]",v.isValid("(]"));
    }
    @Test
    public void simpleThree(){
        ValidParentheses v=new ValidParentheses();
        assertTrue("()[]{}",v.isValid("()[]{}"));
    }
    @Test
    public void complicated(){
        ValidParentheses v=new ValidParentheses();
        assertFalse("([)]",v.isValid("([)]"));
        assertTrue("{[]}",v.isValid("{[]}"));
    }
}
