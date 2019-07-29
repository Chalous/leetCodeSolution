public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length()<1) return true;
        else if (s.length()<2) return false;
        StringBuilder temp=new StringBuilder(s);
        for (int i=0;i<temp.length();i++){
            if (temp.charAt(i)==')'){
                if (i==0) return false;
                else if (temp.charAt(i-1)!='('){
                    return false;
                }
                else {
                    temp.delete(i-1,i+1);
                    i=0;
                }
            }
            else if (temp.charAt(i)==']'){
                if (i==0) return false;
                else if (temp.charAt(i-1)!='['){
                    return false;
                }
                else {
                    temp.delete(i-1,i+1);
                    i=0;
                }
            }
            else if (temp.charAt(i)=='}'){
                if (i==0) return false;
                else if (temp.charAt(i-1)!='{'){
                    return false;
                }
                else {
                    temp.delete(i-1,i+1);
                    i=0;
                }
            }
        }
        if (temp.length()==0) return true;
        else return false;
    }

    public static void main(String[] args) {
        ValidParentheses v=new ValidParentheses();

        System.out.println(v.isValid("(("));
    }
}
