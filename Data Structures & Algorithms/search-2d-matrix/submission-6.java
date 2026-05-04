class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = m-1, mid = low + (high-low)/2;
        while(low<=high){
            mid = low + (high-low)/2;
            if(matrix[mid][0] == target) return true;
            if(matrix[mid][0] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        int row = high;
        if(row<0) return false;

        low = 0; high = n-1; mid = low + (high-low)/2;
        while(low<=high){
            mid = low + (high-low)/2;
            if(matrix[row][mid] == target) return true;
            if(matrix[row][mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return false;
    }
}
