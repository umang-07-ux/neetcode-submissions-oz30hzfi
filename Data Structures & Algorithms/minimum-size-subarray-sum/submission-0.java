class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int low=0;
        int res=Integer.MAX_VALUE;
        int sum=0;
        int total=0;
        for(int i=0;i<n;i++) {
            total=nums[i]+total;
        }
        if(total<target) {
            return 0;
        }
        for(int high=0;high<n;high++) {
            sum=sum+nums[high];
            while(sum>=target) {
                sum-=nums[low];
                res=Math.min(res,high-low+1);
                low++;
            }
        }
        return res;
    }
}