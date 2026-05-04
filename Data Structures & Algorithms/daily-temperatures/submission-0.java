class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temperatures.length];
        for(int t=0; t< temperatures.length; t++){
            while(!stack.isEmpty() && temperatures[stack.getLast()]< temperatures[t]){
                result[stack.getLast()] = t - stack.pollLast();
            }
            stack.addLast(t);
        }
        return result;
    }
}
