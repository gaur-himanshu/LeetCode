public class SumOfTwoInteger {
    public static void main(String[] args) {
        int a=3;
        int b=2;
        System.out.println(getSum(a,b));
    }
    public static int getSum(int a, int b){
        int xor=a^b;
        int carry=a&b;
        if(carry==0){
            return xor;
        }
        else{
            return getSum(xor,carry<<1);
        }
    }
}
