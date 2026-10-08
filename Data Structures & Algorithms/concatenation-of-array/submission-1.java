class Solution {
    public int[] getConcatenation(int[] nums) {
        // int n=nums.length;
        // int[] ans1=new int[2*n];
        // for (int i=0;i<n;i++){
        //     ans[i]=nums[i];
        // }
        // int k=0;
        // for(int j=n;j<2*n;j++){
        //    ans[j]=nums[k];
        //    k++;
        // }
        int n = nums.length;
int[] ans = new int[2 * n];

System.arraycopy(nums, 0, ans, 0, n);
System.arraycopy(nums, 0, ans, n, n); 

        return ans;
    }
}