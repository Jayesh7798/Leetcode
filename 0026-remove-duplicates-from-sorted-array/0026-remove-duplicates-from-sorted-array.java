class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int i = 0; // This is your 'slow' pointer
        
        // This single loop replaces your nested loops
        for (int j = 1; j < nums.length; j++) { // This is your 'fast' pointer
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        
        return i + 1; // Returns the total number of unique elements
    }
}