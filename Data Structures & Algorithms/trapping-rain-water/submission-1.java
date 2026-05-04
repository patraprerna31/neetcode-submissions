class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int i=0,j=n-1;
        int result = 0;
        int maxLeft = height[i], maxRight = height[j];
        while(i<j){
            if(maxLeft<=maxRight){
                i++;
                maxLeft = Math.max(maxLeft, height[i]);
                result+= maxLeft - height[i];
                System.out.println(i+" "+j+" "+ maxLeft + " "+result);
                
            }else{
                j--;
                maxRight = Math.max(maxRight, height[j]);
                result+= maxRight - height[j];
                System.out.println(i+" "+j+" "+maxRight+ " "+ result);
                
            }
            
        }
        return result;
    }
}
