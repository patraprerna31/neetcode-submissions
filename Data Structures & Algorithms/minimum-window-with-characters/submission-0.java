class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> count = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();
        for(char c: t.toCharArray()){
            count.put(c,count.getOrDefault(c, 0)+1);
        }
        int l=0, minLength = Integer.MAX_VALUE;
        int need = count.size(), have = 0;
        int[] res = {0, -1};
        for(int r =0;r<s.length();r++){
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) +1);
            if(count.containsKey(c) && count.get(c) == window.get(c)){
                have++;
            }

            while(have == need){
                if((r-l+1)<minLength){
                    minLength = r-l+1;
                    res[0]=l;
                    res[1]=r;
                }
                c = s.charAt(l);
                window.put(c, window.get(c)-1);
                if(count.containsKey(c) && window.get(c) < count.get(c)){
                    have--;
                }
                l++;
            }
        }
        return s.substring(res[0], res[1]+1);
    }
}
