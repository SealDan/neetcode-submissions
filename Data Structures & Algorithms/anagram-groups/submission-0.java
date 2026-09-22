class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, ArrayList<String>> hm = new HashMap<>();

        for (String s : strs){
            char[] charArrayS = s.toCharArray(); // changes the string to a char array
            Arrays.sort(charArrayS); // sorts that strings char array

            String sSorted = new String(charArrayS); // change the char array that has been sorted back to a string
            hm.putIfAbsent(sSorted, new ArrayList<>()); // puts in the hash map if the sorted out string (key) is not yet in it

            hm.get(sSorted).add(s); // puts in the hash map if found in the hashmap already
        }

        return new ArrayList<>(hm.values());
    }
}
