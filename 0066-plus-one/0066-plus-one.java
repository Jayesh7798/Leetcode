class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // If the digit is 9, it becomes 0 due to the carry
            digits[i] = 0;
        }
        
        // If we reach here, all digits were 9 (e.g., 999 -> 000)
        // We need an extra space at the front for the carry (1000)
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // Remaining indices default to 0 in Java
        
        return newDigits;
    }
}