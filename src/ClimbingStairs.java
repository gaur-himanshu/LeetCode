public class ClimbingStairs {
    public static void main(String[] args) {
        int n=5;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {
         if(n<=3){
             return n;
         }
         int temp=0;
         int a=1;
         int b=2;
         for(int i=3;i<=n;i++){
             temp=a+b;
             a=b;
             b=temp;
         }
         return temp;


    }
    public static int climbStairsdp(int n){
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];

        }
        return dp[n];
    }
}
