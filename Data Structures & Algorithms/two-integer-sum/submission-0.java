class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> freq=new HashMap<>();
        int n=nums.length;
        int a=0,b=0;
        for(int i=0;i<n;i++) {
            int rem=target-nums[i];
            if(freq.containsKey(rem)) {
                a=i;
                b=freq.get(rem);
            }
            freq.put(nums[i],i);
        }
        if(a<b) {
            return new int[]{a,b};
        }
        else {
            return new int[]{b,a};
        }
        
    }
}
