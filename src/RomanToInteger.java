public class RomanToInteger {
    public int romanToInt(String s) {
        int count=0;
        for (int i=0;i<s.length()-1;i++){
            if (romanRule(s.charAt(i))<romanRule(s.charAt(i+1))){
                count-=romanRule(s.charAt(i));
            }
            else {
                count+=romanRule(s.charAt(i));
            }
        }
        count+=romanRule(s.charAt(s.length()-1));
        return count;
    }
    private int romanRule(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:return 0;
        }
    }

    public static void main(String[] args) {
        RomanToInteger r=new RomanToInteger();

        System.out.println(r.romanToInt("IV"));
    }
}
