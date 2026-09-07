class Solution {
    public boolean isAnagram(String s, String t) {
        //make number array
        int[] alpha = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i<s.length(); i++){
            alpha[s.charAt(i)- 'a']++;
        }
        for(int j = 0; j < t.length(); j++){
            int count= t.charAt(j)- 'a';
            alpha[count]--;
            if(alpha[count] < 0 ){
                return false;
            } 
        }
        return true;
        // pass the first word to the array 
        // grab that array and substract to it 
        //check if its 0s 

    }
}
