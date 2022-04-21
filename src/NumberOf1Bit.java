public class NumberOf1Bit {
    public static void main(String[] args) {
        int n=00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
        int c=0;
        int mask=1;
        for(int i=0;i<32;i++){
            if((n&mask)!=0)
                c++;
            mask<<=1;
        }
        return c;
    }
}
