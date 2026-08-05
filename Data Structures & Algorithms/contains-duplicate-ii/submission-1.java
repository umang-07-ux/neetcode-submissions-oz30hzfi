class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>  freq=new HashMap<>();
        HashMap<Integer,Integer> storeindex=new HashMap<>();
        int index=Integer.MIN_VALUE;
        boolean flag=false;
        int res=0;
        for(int i=0;i<n;i++) {
            int x=nums[i];
            freq.put(x,freq.getOrDefault(x,0)+1);
            if(freq.get(x)>1) {
                int j=storeindex.get(nums[i]);
                index=Math.abs(j-i);
                if(index<=k) {
                    flag=true;
                }
                res=Math.max(res,index);
            }
            storeindex.put(nums[i],i);
        }
        return flag;
    }
}