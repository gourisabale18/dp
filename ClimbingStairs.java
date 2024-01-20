class Solution {
    public int climbStairs(int n) {
        
//start from last position
        int one=1; //n position
        int two=1; // n-1 position
        for(int i=n-2;i>=0;i--)
        {
            int temp=one;
            one=one+two;
            two=temp;

        }
        return one;
    }
}