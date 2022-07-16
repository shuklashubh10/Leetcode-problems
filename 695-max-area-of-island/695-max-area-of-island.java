class Solution {
     boolean seen[][];
    public int maxAreaOfIsland(int[][] grid) {
        int max=0 ;
        int row = grid.length;
        int columns = grid[0].length;
        seen = new boolean [row][columns];
        for (int i =0 ; i < row ; i++)
        {
            for (int j =0 ; j < columns; j++)
            {
                max= Math.max(max, area(i, j ,grid ));
            }
        }
        return max ;
    }
    public int area (int i , int j , int [][]grid )
    {
        if (i <0 || i >= grid.length|| j <0 || j >= grid[0].length|| seen[i][j]==true||(grid[i][j]==0))
            return 0 ;
        seen [i][j]= true ;
        
        return(1+ area(i+1, j ,grid)+area(i-1, j ,grid)+area(i, j-1 ,grid)+area(i, j+1 ,grid));
    }
    
}