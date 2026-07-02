class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i; // Record the first time we see it
                }
                last = i; // Keep updating last every time we see it
            }
        }
        
        return new int[]{first, last};
    }
}
