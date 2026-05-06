class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a->a[0]));
        for(int[] point: points){
            int dist = point[0]*point[0] + point[1]*point[1];
            pq.add(new int[]{dist, point[0], point[1]});
        }
        int result[][] = new int[k][2], i =0;
        while(!pq.isEmpty() && i<k){
            int[] point = pq.poll();
            result[i] = new int[]{point[1],point[2]};
            i++;
        }
        return result;

    }
}
