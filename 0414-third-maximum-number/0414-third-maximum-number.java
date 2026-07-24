class Solution {
    public int thirdMax(int[] nums) {
        // Use Long to safely handle Integer.MIN_VALUE inputs
        long max = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;

        for (int num : nums) {
            // Skip duplicates to ensure distinct maximums
            if (num == max || num == smax || num == tmax) {
                continue;
            }

            // Shift values down when a new maximum is found
            if (num > max) {
                tmax = smax;
                smax = max;
                max = num;
            } else if (num > smax) {
                tmax = smax;
                smax = num;
            } else if (num > tmax) {
                tmax = num;
            }
        }

        // If third max does not exist, return the maximum number
        return tmax == Long.MIN_VALUE ? (int) max : (int) tmax;
    }
}