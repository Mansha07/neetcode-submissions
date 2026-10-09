class Solution {
    public boolean hasDuplicate(int[] nums) {
        // int n=nums.length;
        // int i=0;
        // int j;
        // while(i<n){
        //     for(j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        //     i++;
        // }
        // return false;
        int n=nums.length;
        HashSet<Integer> ans=new HashSet<>();
        // for(int i=0; i<n;i++){
        //     ans.add(nums[i]);
        // }
        // if(ans.size()==n){
        //     return false;
        // }
        // return true;
        for(int i=0;i<n;i++){
            if(ans.contains(nums[i])){
                return true;
            }
            ans.add(nums[i]);
        }
        return false;
    }
}