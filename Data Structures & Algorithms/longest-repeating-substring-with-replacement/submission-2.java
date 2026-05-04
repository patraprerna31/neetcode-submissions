class Solution {
    public int characterReplacement(String s, int k) {
        char[] charArray = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int maxC = 0, l=0, res = 0;
        for(int r=0; r<charArray.length;r++){
            map.put(charArray[r], map.getOrDefault(charArray[r], 0) + 1);
            maxC= Math.max(maxC, map.get(charArray[r]));
            while((r-l+1)-maxC >k){
                map.put(charArray[l], map.get(charArray[l])-1);
                l++;
            }
            res = Math.max(res, (r-l+1));
        }
       return res;

    }
}
 