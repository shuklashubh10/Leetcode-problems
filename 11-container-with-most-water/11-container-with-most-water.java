class Solution {
    public int maxArea(int[] height) {
     int left =0 ;
         int right = height.length-1; 
        int a =0 ; 
        while(left<right)
        {
            if (height[left]<height[right])
            {
                a= Math.max(a, height[left]*(right-left));
                left++;
            }
            else 
            {
                a= Math.max(a, height[right]*(right-left));
                right--;
            }
            
        }
        return a ; 
    }
}