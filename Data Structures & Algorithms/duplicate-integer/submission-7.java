class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer> seenNums = new Hashtable<>();
        for(Integer i = 0; i < nums.length; i++){
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