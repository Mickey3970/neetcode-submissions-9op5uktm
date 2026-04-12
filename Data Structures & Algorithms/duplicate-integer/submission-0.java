class Solution {
    public boolean hasDuplicate(int[] nums) {
        int length = nums.length;
        boolean contains_duplicate = false;
        for(int i = 0; i<length; i++){
            for(int j = 0; j<length; j++){
                if(i != j && nums[i] == nums[j]){
                    contains_duplicate = true;
                }
            }
        }
        return contains_duplicate;
    }
}