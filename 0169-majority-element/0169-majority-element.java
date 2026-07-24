class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0; // Reset count for each element
            
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) { // Compare values, not indices
                    count++;
                }
            }

            if (count > n / 2) {
                return nums[i]; // Return the actual array element
            }
        }

        return -1;
    }
}