public class ReverseInteger {
    public int reverse(int x) {
        int a=(int)Math.pow(2,31);
        int out=0;
        int count=count(x);
        for (int i=count-1;i>=0;i--){
            if (x!=0){
                out+=x%10*Math.pow(10,i);
                if ((out<=-a)||(out>a-1)){
                    return 0;
                }
                x/=10;
            }
            else {
                break;
            }
        }
        return out;
    }
    private int count(int x){
        int count=0;
        while (x!=0){
            x=x/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        ReverseInteger r=new ReverseInteger();
        System.out.println(r.reverse(
                1534236469));
        System.out.println(r.count(-123));
    }
}
