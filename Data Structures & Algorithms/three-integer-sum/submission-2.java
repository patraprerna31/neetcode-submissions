class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int k = 0; k <= n-3; k++) {
            int sum = -nums[k];
            int i= k+1, j=n-1;
            if(k>0 && nums[k-1]==nums[k]) continue;
            while(i<j){
                if(nums[i]+nums[j]>sum){
                    j--;
                }
                else if(nums[i]+nums[j]<sum){
                    i++;
                }
                else{
                    result.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    i++; j--;
                    while (i < j && nums[i] == nums[i - 1]) i++; // skip dup i
                    while (i < j && nums[j] == nums[j + 1]) j--; // skip dup j
                }
            }
        }
        return result;
    }
}
