class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstIdx = findFirst(nums, target);
        int lastIdx = findLast(nums, target);
        
        return new int[]{firstIdx, lastIdx};
    }

    private int findFirst(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int firstIdx = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                firstIdx = mid;
                high = mid - 1; // Look for earlier occurrences on the left
            }
        }
        return firstIdx;
    }

    private int findLast(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int lastIdx = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                lastIdx = mid;
                low = mid + 1; // Look for later occurrences on the right
            }
        }
        return lastIdx;
    }
}