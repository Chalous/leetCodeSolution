import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class newValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> closing = new HashMap<>();
        closing.put('[', ']');
        closing.put('{', '}');
        closing.put('(', ')');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char br = s.charAt(i);
            if (br =='[' || br == '{' || br == '(')
                stack.push(br);
            else if (stack.isEmpty() || (br != closing.get(stack.pop())))
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        newValidParentheses n=new newValidParentheses();
        System.out.println(n.isValid("{[()]}"));
    }
}
