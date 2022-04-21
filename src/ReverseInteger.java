public class ReverseInteger {
    public static void main(String[] args) {
        int x=123;
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        long n=0;
        long t=0;
        while(x!=00){
            t=x%10;
            n=n*10+t;
            x=x/10;
        }
        if(n<=Integer.MIN_VALUE||n>=Integer.MAX_VALUE){
            return 0;
        }
        else{
            return (int)n;
        }

    }
}
