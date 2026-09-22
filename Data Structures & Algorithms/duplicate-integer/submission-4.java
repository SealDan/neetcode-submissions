class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer> seenNums = new Hashtable<>();
        for(Integer i = 0; i < nums.length; i++){
            if(seenNums.containsKey(nums[i])) return true;
            seenNums.put(nums[i], 1);
        }

        return false;
    }
}