class Solution {
    public int[] twoSum(int[] nums, int target) {
        java.util.HashMap<Integer, Integer> seen = new java.util.HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                int j = i;
                int k = seen.get(complement);
                return new int[]{Math.min(k, j), Math.max(k, j)};
            }
            seen.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}