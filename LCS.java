//Top Down Approach
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int m=text1.length();
        int n=text2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                dp[i][j]=-1;
            }
        }
        return helper(text1,text2,m,n,dp);
        
    }
    //start comparing from end of both the strings
    public int helper(String text1,String text2,int i,int j,int[][] dp)
    {
        //base case
        //when any of string finishes
        if(i==0 || j==0)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        //if there is match of chars, increase length by 1
        if(text1.charAt(i-1)==text2.charAt(j-1))
        {
            dp[i][j]= 1+helper(text1,text2,i-1,j-1,dp);
            return dp[i][j];
        }
        else
        {
        // chars at i and j are not matching
        return dp[i][j]= Math.max(helper(text1,text2,i-1,j,dp),helper(text1,text2,i,j-1,dp));
        }
       
    }
}