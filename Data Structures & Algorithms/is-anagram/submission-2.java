class Solution {
    public boolean isAnagram(String s, String t) {

int a = s.length();
int b= t.length();

if(a != b){
    return false;
}

    char[]compare = new char[s.length()];

    char x;
    char y;
    for(int i= 0; i< s.length() ;i++){
        
    compare[i] =  s.charAt(i);
    }
    for(int j= (t.length())-1; j >= 0;j--){
        boolean found = false;
        y= t.charAt(j);

        for( int g = 0; g<s.length();g++){
        
            x = compare[g];

            if (x == y){
                compare[g] = '0';
                found = true;
                break;
            }
        }
            if(!found){
                return false;
            }
        }
        return true;
    }
}
    

