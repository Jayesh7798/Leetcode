import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();
        
        // Add all elements from nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Check if elements of nums2 exist in set1
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersect.add(num);
            }
        }
        
        // Convert the intersection set back to a primitive int array
        int[] result = new int[intersect.size()];
        int i = 0;
        for (int num : intersect) {
            result[i++] = num;
        }
        
        return result;
    }
}