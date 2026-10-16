class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            // Skip a number if it appeared earlier
            boolean checked = false;
            for (int x = 0; x < i; x++) {
                if (nums[x] == nums[i]) {
                    checked = true;
                    break;
                }
            }

            if (checked) {
                continue;
            }

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }

                if (count > n / 2) {
                    return nums[i];
                }
            }
        }

        return -1;
    }
}