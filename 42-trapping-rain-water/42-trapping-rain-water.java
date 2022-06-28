class Solution {
    public int trap(int[] height) {
       int left = 0, right = height.length - 1, water = 0;
 
        int maxLeft = height[left];
        int maxRight = height[right];
 
        while (left < right)
        {
            if (height[left] <= height[right])
            {
                left++;
                maxLeft = Integer.max(maxLeft, height[left]);
                water += (maxLeft - height[left]);
            }
            else {
                right--;
                maxRight = Integer.max(maxRight, height[right]);
                water += (maxRight - height[right]);
            }
        }
 
        return water;
        
    }
    
}