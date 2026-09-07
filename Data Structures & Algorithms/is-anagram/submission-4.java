class Solution {
    public boolean isAnagram(String s, String t) {
    int[] abc = new int[26];

if(s.length()!=t.length()){
    return false;
}

for(int i = 0; i<s.length(); i++){
        abc[s.charAt(i) - 'a']++;
}

for(int j = 0; j<t.length(); j++){
    int count = t.charAt(j) - 'a';
    abc[count]--;
if(abc[count]< 0){
    return  false;
}

}       
return true;
    
}
}