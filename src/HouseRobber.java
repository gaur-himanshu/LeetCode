import java.util.Arrays;
import java.util.Scanner;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int j = 0; j < test; j++) {
            int size = sc.nextInt();
            int[] ar = new int[size];
            int[] dp = new int[size];
            Arrays.fill(dp,-1);
            for (int i = 0; i < size; i++) {
                ar[i]= sc.nextInt();
            }
            System.out.println(count(ar,0,dp));

        }

    }
    public static int count(int[] ar,int i,int[] dp){
        if(i>= ar.length)
            return 0;
//        int amount=0;
        if (dp[i]!=-1)
            return dp[i];
        int in = ar[i]+count(ar, i+2,dp);
        int ex=count(ar,i+1,dp);
        return dp[i]=Math.max(in,ex);
    }
}
