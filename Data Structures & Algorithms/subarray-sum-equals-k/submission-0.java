class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int res=0;
        int sum=0;
        HashMap<Integer,Integer> freq=new HashMap<>();
        freq.put(0,1);
        for(int i=0;i<n;i++) {
            sum+=nums[i];
            int remaining=sum-k;
            int f=freq.getOrDefault(remaining,0);
            freq.put(sum,freq.getOrDefault(sum,0)+1);
            res+=f;
        }
        return res;
    }
}