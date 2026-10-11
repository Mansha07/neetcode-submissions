class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length - 1; i++) {
        //     if (nums[i + 1] - nums[i] != 1) {
        //         return nums[i] + 1;
        //     }
        // }
        // if(nums[0]==0){
        //     return nums[nums.length - 1] +1;
        // }
        // return 0;
        boolean hasZero = false;
        int n = nums.length;
        int max = 0;
        int expected = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                hasZero = true;
            }
            max = Math.max(max, nums[i]);
            expected += nums[i];
        }
        int sum = (max * (max + 1)) / 2;
        if ((expected - sum) == 0) {
            return (hasZero ? (max + 1) : 0);
        }
        return sum-expected;
    }
}
