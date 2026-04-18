class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> heap =
    new PriorityQueue<>((a, b) -> Integer.compare(a.getValue(), b.getValue()));
        int res[] = new int[k];        
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num, 0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            heap.add(entry);
            if(heap.size()>k){
                heap.poll();
            }
        }
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = heap.poll();
            res[i] = entry.getKey();
        }
        return res;
    }
}
