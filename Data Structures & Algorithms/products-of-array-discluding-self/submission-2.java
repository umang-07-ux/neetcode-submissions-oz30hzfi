class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int product1 = 1;
        int product2 = 1;
        int zeroCount = 0;

        // Product of all elements
        // Product of only non-zero elements
        // Count total zeros
        for (int i = 0; i < n; i++) {

            product1 *= nums[i];

            if (nums[i] == 0) {
                zeroCount++;
                continue;
            }

            product2 *= nums[i];
        }

        for (int j = 0; j < n; j++) {

            if (zeroCount > 1) {
                // More than one zero -> every answer is 0
                nums[j] = 0;
            }
            else if (zeroCount == 1) {
                // Only zero itself gets product of non-zero elements
                if (nums[j] == 0) {
                    nums[j] = product2;
                }
                else {
                    nums[j] = 0;
                }
            }
            else {
                // No zero -> normal division
                nums[j] = product1 / nums[j];
            }
        }

        return nums;
    }
}