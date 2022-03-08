public class DivideTwoInteger {
    public static int divide(int dividend, int divisor) {
        int n=0;
        int si=(dividend<0)^(divisor<0)?-1:1;
        dividend=Math.abs(dividend%1000000007);
        divisor=Math.abs(divisor);
        if(divisor==1){
            if(si==-1)
                dividend=-dividend;
            return dividend;
        }
        else {
            while (dividend >= divisor) {
                dividend = dividend - divisor;
                ++n;
            }
            if (si == -1)
                return -n;
            else
                return n;
        }
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648,-1));
    }
}
