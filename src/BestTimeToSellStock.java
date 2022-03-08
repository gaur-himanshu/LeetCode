import java.util.Arrays;

public class BestTimeToSellStock {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int l=0;
        int o=0;
        for (int i = 0; i < prices.length; i++) {
            if (min>prices[i]){
                min=prices[i];
            }
            l=prices[i]-min;
            if (l>o){
                o=l;
            }
        }
        return o;

    }
}
