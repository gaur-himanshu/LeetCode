public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] ar= {3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(ar));

    }
    public static int maxProfit(int[] prices){
        int n=prices.length;
        if(n==0){
            return 0;
        }
        int[] left = new int[n];
        int[] right=new int[n];
        int min=prices[0];
        left[0]=0;
        for (int i = 1; i < n; i++) {
            if(prices[i]<min){
                min=prices[i];
            }
            int profit = prices[i]-min;
            left[i]=Math.max(left[i-1],profit);
        }
        int max = prices[n-1];
        for (int i = n-2; i >=0 ; i--) {
            if(prices[i]>max){
                max=prices[i];
            }
            int profit = max-prices[i];
            right[i]=Math.max(right[i+1],profit);
        }
        int maxProfit=0;
        for (int i = 0; i < n; i++) {
            maxProfit=Math.max(maxProfit,left[i]+right[i]);
        }
        return maxProfit;

    }
}
