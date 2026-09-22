class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        for(int i = 0; i < strs.length; i++){
            int j = 0;
            while(j < Math.min(ans.length(), strs[i].length())){
                if(strs[i].charAt(j) != ans.charAt(j)) break;
                j++;
            }
            ans = strs[i].substring(0, j);
        }
        return ans;
    }
}