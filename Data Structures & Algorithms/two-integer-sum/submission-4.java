class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int j;
        // int ans[] = new int[2];
        // for (int i = 0; i < nums.length; i++) {
        //     j = i+1;
        //     while (j < nums.length) {
        //         if (nums[i] + nums[j] == target) {
        //             ans[0] = i;
        //             ans[1] = j;
        //             return ans;
        //         }
        //         j++;
        //     }
        // }
        // return null;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int m;
        for (int i = 0; i < nums.length; i++) {
            m=target-nums[i];
            if(map.containsKey(m)){
                ans[0]=map.get(m);
                ans[1]=i;
                return ans;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
