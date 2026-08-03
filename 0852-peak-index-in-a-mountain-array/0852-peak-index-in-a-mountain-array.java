class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        // Initialize boundaries inside the mountain slope range
        int low = 1;
        int high = arr.length - 2;
        
        while (low <= high) {
            // Safe calculation to prevent integer overflow
            int mid = low + (high - low) / 2;
            
            // Check if mid is the peak element
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // If we are on the ascending slope, move right
            else if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }
            // If we are on the descending slope, move left
            else {
                high = mid - 1;
            }
        }
        
        return -1; // Fallback default value
    }
}
    
