TC: O(n^2)

class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()==0)
        {
            return s;
        }
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++)
        {
            //odd length case
            int len1=expandFromMiddle(s,i,i);
            //even length case
            int len2=expandFromMiddle(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len>end-start)
            {
                start=i-((len-1)/2);//i will be center and len will substring len
                end=i+(len/2);
            }
        }
        return s.substring(start,end+1);
        
    }
    //function

    private int expandFromMiddle(String s, int left,int right)
    {
        if(s==null || left>right)
        {
            return 0;
        }
    
            //pointers in boundry and chars are matching
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                left--;
                right++;
            }
            return right-left-1; //lenth of palindromic substring that we just got
        
    }
}