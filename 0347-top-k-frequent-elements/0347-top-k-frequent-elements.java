class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(int i : hm.keySet()){
            pq.offer(new Pair<Integer,Integer>(i,hm.get(i)));
        }
        int[] arr = new int[k];
        int idx =0;
        while(k>0){
            arr[idx++] = pq.poll().getKey();
            k--;
        }
        return arr;
    }
}