class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            // Fixed: j starts at 0 to scan the entire array
            for (int j = 0; j < n; j++) { 
                // Fixed: count matches instead of returning immediately
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            // Fixed: if the number appeared only once, return that number
            if (count == 1) {
                return nums[i];
            }
        }
        return -1; // Added to satisfy compiler in case no unique element is found
    }
}