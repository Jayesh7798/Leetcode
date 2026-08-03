class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int ele : nums) {
            actualSum += ele; // Accumulate the array sum
        } 
        
        return expectedSum - actualSum;
    }
}