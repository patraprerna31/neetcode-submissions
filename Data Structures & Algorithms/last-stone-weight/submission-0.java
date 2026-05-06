class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int stone: stones){
            pq.add(stone);
        }
        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            int diff = a-b;
            if(diff >0) pq.add(diff);
        }
        return pq.size() == 1 ? pq.poll() : 0;
    }
}
