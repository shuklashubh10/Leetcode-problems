class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] res = new int [temperatures.length];
        Stack <Integer []> stack = new Stack <> ();
        for (int i = 0 ; i < temperatures.length; i ++)
        {
            while (!stack.isEmpty()&& stack.peek()[0]< temperatures[i])
            {
                Integer [] temp = stack.pop();
                res[temp[1] ]= i- temp[1] ;
                    
            }
                    stack.push(new Integer[] {temperatures[i],i });
        }
        return res ;
    }
}