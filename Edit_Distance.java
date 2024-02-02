class Solution {
    public int minDistance(String word1, String word2) {
        
        //bottom up 
        int m=word1.length();
        int n=word2.length();
        int[][] dp=new int[m+1][n+1];

        //first col ...length of s2 will be 0
        for(int i=0;i<=m;i++)
        {
            dp[i][0]=i; //i delete operations
        }
        //first row ...length of s1 will be 0
        for(int i=0;i<=n;i++)
        {
            dp[0][i]=i; //i insert operations
        }
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(word1.charAt(i-1)==word2.charAt(j-1))
                {
                    dp[i][j]=0+dp[i-1][j-1];
                }
                else
                {
                    //min of insert , delete and replace ops
                    dp[i][j]=1+ Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                }
            }
        }
        return dp[m][n];

    }
}