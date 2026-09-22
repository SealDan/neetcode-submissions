class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int element = 0, maxCount = 0;

        for(int n : nums){
            hm.put(n, hm.getOrDefault(n, 0) + 1);

            if(hm.get(n) > maxCount){
                maxCount = hm.get(n);
                element = n;
            }
        }

        
        return element;
    }
}