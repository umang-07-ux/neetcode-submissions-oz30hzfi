class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int maxwater=0;
        int i=0, j=n-1;
        while(i<j) {
            int indexdif=j-i;
            int min=Math.min(heights[j],heights[i]);
            maxwater=Math.max(maxwater,min*indexdif);
            if (heights[i]>heights[j]) {
                j--;
            }
            else if(heights[i]<heights[j]) {
                i++;
            }
            else{
                i++;
                j--;
            }
            
        }
        return maxwater;
    }
}
