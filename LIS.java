class Solution {
    public int lengthOfLIS(int[] nums) {

        int n=nums.length;
        if(n==0 || n==1) return n;
        int[] arr=new int[n];
        int len=1;
        arr[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            if(nums[i]>arr[len-1])
            {
                arr[len]=nums[i];
                len++;
            }
            else
            {
               //replace existing element by perfroming BS
                int index=BS(0,len-1,nums[i],arr);
                arr[index]=nums[i];
            }
        }
        return len;
    }
    private int BS(int low,int high, int target, int[] arr)
    {
        int mid=0;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;//correct position for element
    }
}