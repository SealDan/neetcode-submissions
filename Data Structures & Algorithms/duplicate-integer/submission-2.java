class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seenNum = new HashSet<Integer>();
       for(Integer n : nums){
        if(seenNum.contains(n)) return true;
        seenNum.add(n);
       }

       return false;
    }
}