class Solution {
    public int maxProfit(int[] prices) {
     if(prices.length==0){
        return 0;
     }   
     int ans=0;
     for(int i=0;i<prices.length;i++){
        for(int j=i+1; j<prices.length; j++){
          if(ans<prices[j]-prices[i]){
            ans=prices[j]-prices[i];
          }
        }
     }
     return ans;
    }
}
