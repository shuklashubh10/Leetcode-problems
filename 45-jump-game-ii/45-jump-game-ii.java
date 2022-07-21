class Solution {
    public int jump(int[] nums) {
       int r =0; int l =0 ; 
        int res =0 ;
        int fur =0 ;
        while (r<nums.length-1)
        {
            
            for (int i = l ;i <=r; i++)
            {
                fur = Math.max(fur, nums[i]+i);
            }
            l=r+1;
            r= fur;
            res++;
        }
        return res ;
    }
}