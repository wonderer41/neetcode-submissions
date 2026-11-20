class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> tempList = new HashSet<>();

        for(int i = 0; i < nums.length;i++){
            tempList.add(nums[i]);
        }
        //this one goes trought the hashset
        int longest = 0;
        for(int j : tempList){
            int count = 1;
            //checks for the previous to start 
            if(!(tempList.contains(j-1))){
                
                int current = j;
                //it should iterate the hashset too
                while(tempList.contains(current+1)){
                    current++;
                    count++;
                }
                
            }
            if(count > longest){
                longest = count;
            }
        }
        return longest;
        
        
    }
}
