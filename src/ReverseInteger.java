public class ReverseInteger {
    public int reverse(int x) {
        int t=x;
        int out=0;
        for (int i=0;;i++){
            if (t!=0){
                out+=t%10*Math.pow(10,i);
                t=t/10;
            }
            else {
                break;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        ReverseInteger r=new ReverseInteger();
        System.out.println(r.reverse(123));
    }
}
