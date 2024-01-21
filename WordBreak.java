class WordBreak{
    public boolean wordBreak(String s, List<String> wordDict) {
        
        Set<String> hset=new HashSet<>(wordDict);
        int l=s.length();
        boolean[] dp=new boolean[l+1]; //one length extra for dp array
        //we want to chk if string before each char has valid splits or no
        dp[0]=true; //by default
        for(int i=1;i<dp.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(dp[j] && hset.contains(s.substring(j,i)))//string before each char
                {
                    dp[i]=true;
                    break;
                }
                //otherwise it willbe false by default since no matching word in dict is found
            }
            
        }
        return dp[l];
    }
}