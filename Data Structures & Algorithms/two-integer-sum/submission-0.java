class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsHM = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            numsHM.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            if(numsHM.containsKey(diff) && numsHM.get(diff) != i){
                return new int[]{i, numsHM.get(diff)};
            }
        }

        return new int[0];
    }
}
