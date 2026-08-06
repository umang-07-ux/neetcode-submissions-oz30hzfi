class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> freq=new HashMap<>();
        boolean flag=false;
        for(int i=0;i<n;i++) {
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
            if(freq.get(nums[i])>1) {
                flag=true;
            }
        }
        return flag;
    }
}