class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j=1;
        int i=0;
        int[] res=new int[2];
        for(;i<nums.length;i++)
        {
            int num_1=target-nums[i];
            if(j<=nums.length-1 && nums[j]!=num_1)
            {
                j++;
                i--;
            }
            else if(j>nums.length-1)
            {
                j=i+2;    
            }
            else if(nums[j]==num_1)
            {
                break;
            }
        }
        res[0]=i;
        res[1]=j;
        return res;
    }
}