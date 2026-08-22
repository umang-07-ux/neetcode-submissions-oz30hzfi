class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int i=0,j=n-1;
        int a=0,b=0;
        while(j>i) {
            if(numbers[i]+numbers[j]>target) {
                j--;
            }
            else if(numbers[i]+numbers[j]<target) {
                i++;
            }
            else if(numbers[i]+numbers[j]==target) {
                a=i+1;
                b=j+1;
                break;
            }
        }
        return new int[]{a,b};
    }
}
