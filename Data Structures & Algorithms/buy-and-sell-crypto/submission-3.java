class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0]=prices[0];
        right[n-1] = prices[n-1];
        for(int i=1;i<n;i++){
            left[i] = Math.min(left[i-1], prices[i]);
            right[n-1-i] = Math.max(prices[n-i-1], right[n-i]);
        }
        int result = 0;
        for(int i =0;i<n;i++){
            result = Math.max(result, right[i]-left[i]);
        }
        return result;
    }
}
