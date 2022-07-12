class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        helper(ans, 0, nums, list, false);
        return ans;
    }
    
     public void helper(List<List<Integer>> ans, int start, int[] nums, List<Integer> list, boolean ignored) {
        if (start>=nums.length) {
            ans.add(new ArrayList<>(list));
        } else {
            helper(ans, start+1, nums, list, true);
           
            if (start>0 && nums[start-1]==nums[start] && ignored) 
                return;
            list.add(nums[start]);
            helper(ans, start+1, nums, list, false);
            list.remove(list.size()-1);
        }
    }
    
}