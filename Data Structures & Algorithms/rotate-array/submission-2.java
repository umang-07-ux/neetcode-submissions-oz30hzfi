class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        ans(nums,0,n-1);
        ans(nums,0,k-1);
        ans(nums,k,n-1);
    }
    public void ans(int[] arr,int i,int j) {
        int n=arr.length;
        while(i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}