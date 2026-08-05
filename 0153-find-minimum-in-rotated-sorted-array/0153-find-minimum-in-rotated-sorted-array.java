class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                // Minimum is in the right unsorted part
                low = mid + 1;
            } else {
                // Minimum is mid or to the left of mid
                high = mid;
            }
        }

        // When low == high, it points to the minimum element
        return nums[low];
    }
}