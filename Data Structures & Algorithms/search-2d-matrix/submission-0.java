class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom =matrix.length-1;
        int correctRow =0;
        while (top <= bottom){
            int middle = (top+bottom)/2;
            int current = matrix [middle][matrix[0].length -1];
            int firstOfRow = matrix[middle][0];
            if(current == target){
                return true;
            }else if(current < target){
            
                top = middle + 1;

            }else if(current > target){
                if(target >= firstOfRow){
                    correctRow = middle;
                    break;
                }
                bottom = middle -1;
            }
        }
        int left = 0;
        int right = matrix[correctRow].length-1;
        while(left <= right){
            int middle = (left +right)/2;
            int current = matrix[correctRow][middle];
            if(target == current ){
                return true;
            }else if(current < target){
                left = middle + 1;
            }else if(current > target){
                right = middle - 1;
            }

        }
        return false;
    }
}
