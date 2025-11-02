class Solution {
    public int maxProfit(int[] prices) {
        int r=0;
        int l=0;
        int p=0;
        int curr=0;
        while(r<prices.length)
        {
            p=Math.max(p, curr);
            if(curr<0)
            {
                while(l<=r && curr<0)
                {
                    l++;
                   curr=prices[r]-prices[l];
                }
            }
            r++;
            if(r<prices.length)
            {
                curr=prices[r]-prices[l];
            }
        }
        return p;
    }
}