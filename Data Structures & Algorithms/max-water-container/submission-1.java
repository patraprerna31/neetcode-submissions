class Solution {
    public int maxArea(int[] heights) {
        int i =0, j = heights.length-1;
        int maxWater = 0;
        while(i<j){
            int area = (j-i);
            if(heights[i]<heights[j]){
                area*=heights[i];
                i++;
            }else if(heights[i]>heights[j]){
                area*=heights[j];
                j--;
            }else{
                area*=heights[i];
                i++;j--;
            }
            maxWater = Math.max(maxWater,area);
        }
        return maxWater;
    }
}
