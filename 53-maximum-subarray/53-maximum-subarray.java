class Solution {
    public int maxSubArray(int[] nums) {
           int maxsofar= nums[0];
            int maxsumend= nums[0];
        for (int i =1; i < nums.length; i ++)
        {
            maxsumend = Math.max(maxsumend+nums[i] , nums[i]);
            if (maxsofar< maxsumend)
            {
                maxsofar = maxsumend; 
            }
        }
        return maxsofar;
    }
}