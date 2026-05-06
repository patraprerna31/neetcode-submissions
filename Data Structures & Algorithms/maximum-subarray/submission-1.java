class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0],currSum=nums[0], n = nums.length;
        for(int i=1;i<n;i++){
            
            if(currSum<0) currSum=0;
            currSum+=nums[i];
            max = Math.max(max, currSum);
        }
        return max;

    }
}
