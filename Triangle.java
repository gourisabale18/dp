class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        //bottom up approach
        int n=triangle.size();
        int[][] dp=new int[n][n];
        
        //start with base case
        //last row fill dp array with last row
        for(int j=0;j<n;j++)
        {
            dp[n-1][j]=triangle.get(n-1).get(j);
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                dp[i][j]=triangle.get(i).get(j)+Math.min(dp[i+1][j],dp[i+1][j+1]);
            }
        }
        return dp[0][0];
    }
}