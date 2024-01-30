class Solution {
    public int tribonacci(int n) {
       //use bottom up dp
       //base condition
       if(n==0 || n==1)
       {
           return n;
       }
       int[] dp=new int[n+1];
      
       dp[0]=0;
       dp[1]=1;
       dp[2]=1;

       for(int i=3;i<=n;i++)
       {
           dp[i]=dp[i-1]+dp[i-2]+dp[i-3]; //reuse dp array instead of giving recursive call again and again
       }
       return dp[n];
        
    }
}