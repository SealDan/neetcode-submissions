class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer> seenNums = new Hashtable<>();
        int n = nums.length;
        for(Integer i = 0; i < n; i++){
            if(!seenNums.containsKey(nums[i])){
                seenNums.put(nums[i], 1);
            }
            else{
                return true;
            }
            
        }

        return false;
    }
}