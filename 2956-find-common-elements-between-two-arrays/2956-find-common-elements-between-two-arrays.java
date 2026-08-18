
        class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        boolean[] has1 = new boolean[101];
        boolean[] has2 = new boolean[101];

        for (int num : nums1) has1[num] = true;
        for (int num : nums2) has2[num] = true;

        int count1 = 0, count2 = 0;

        for (int num : nums1) if (has2[num]) count1++;
        for (int num : nums2) if (has1[num]) count2++;

        return new int[]{count1, count2};
    }
}
    