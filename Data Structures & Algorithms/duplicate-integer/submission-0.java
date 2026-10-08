class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        int i=0;
        int j;
        while(i<n){
            for(j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
            i++;
        }
        return false;
    }
}