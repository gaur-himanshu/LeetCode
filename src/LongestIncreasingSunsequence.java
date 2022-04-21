public class LongestIncreasingSunsequence {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,2,3};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums){
        int n=nums.length;
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int[] dp= new int[n];
        dp[0]=1;
        int ans=1;
        for(int i=1;i<n;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    max=Math.max(max,dp[j]);
                }

            }
            dp[i]=max+1;
            ans=Math.max(ans,dp[i]);

        }
        return ans;
    }
}
