class Solution {
    public int maxArea(int[] heights) {
      int left = 0;
      int right = heights.length-1;
        int lastArea = 0;

      while(left < right){
        
        int minHeight = 0;

        if(heights[left] > heights[right]){
            minHeight = heights[right];
        }else{
            minHeight = heights[left];
        }


        int length = (right-left);
        int currentArea = minHeight * length;

        if(currentArea> lastArea){
            lastArea = currentArea;
        }

        if(heights[left] < heights[right]){
        left++;
        }else if(heights[left] > heights[right]){
        right--;
        }else{
            left++;
            right--;
        }
        
    
      }
    return lastArea;

      }
}
