class Solution {
    public boolean hasDuplicate(int[] nums) {
        // This is our memory -- stores numbers we have seen
        HashSet<Integer> seen = new HashSet<>();
        for (int num: nums) {
            // if we already saw this number -- DUPLICATE fpund!
            if (seen.contains(num)){
                return true;
            }
            // otherwise, remember this number
            seen.add(num);

        }
        // we finished the lood without finding a duplicate
        return false;
    }
}