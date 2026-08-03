class Solution {
    public int singleNonDuplicate(int[] nums) {
         int n = nums.length;
        
        // Edge cases for single element or boundaries
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];
        
        int low = 0;
        int high = n - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Check if mid is the unique element
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            
            // Check index parity to decide which half to search
            // If mid is even and matches next, or mid is odd and matches previous:
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || 
                (mid % 2 != 0 && nums[mid] == nums[mid - 1])) {
                low = mid + 1; // Unique element is in the right half
            } else {
                high = mid - 1; // Unique element is in the left half
            }
        }
        
        return -1;
    }
}
        
    
    