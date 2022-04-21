public class CountingBits {
    public static void main(String[] args) {
        int n=2;
        int[] ar = countBits(n);
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
    public static int[] countBits(int n) {
        int[] output = new int[n+1];
        for(int i=1;i<output.length;i++){
            output[i]=output[i>>1]+i%2;
        }
        return output;
    }
}
