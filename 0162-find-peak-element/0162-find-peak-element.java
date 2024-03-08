class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
          int start=0,end=n-1,mid;
       while(start<=end){
           mid=(start+end)/2;
           int prev=mid-1>=0?mid-1:0;
           int next=mid+1<n?mid+1:n-1;
           if(nums[mid]>=nums[prev] && nums[mid]>=nums[next])return mid;
           else if(nums[mid]<nums[next])start=mid+1;
           else end=mid-1;
       }
       return 0;
    }
}