import java.util.Arrays;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[] =new int[nums.length];
        int d=0;
        for(int i=0;i<nums.length;i++)
        {
            int c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    c++;
                }
            }
            ans[d++]=c;
        }
        return ans;
    }
}