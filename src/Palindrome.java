public class Palindrome {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        if (s.length()==1||s.length()==2&&(s.charAt(0)==s.charAt(1))){
            return true;
        }
        else if (s.charAt(0)==s.charAt(s.length()-1)){
            s=cut(s.substring(1,s.length()-1));
            return isPalindrome(Integer.valueOf(s));
        }
        return false;
    }
    private String cut(String s){
        if (s.length()==1||s.length()==2&&(s.charAt(0)==s.charAt(1)))
            return "22";
        else if (s.charAt(0)==s.charAt(s.length()-1)){
            return cut(s.substring(1,s.length()-1));
        }
        return "21";
    }

    public static void main(String[] args) {
        Palindrome p=new Palindrome();
        System.out.println(p.isPalindrome(10022201));
    }
}
