class Solution {

    public String encode(List<String> strs) {
        StringBuilder sender = new StringBuilder();
        for(String word:strs){
            String wordSize = word.length()+ "]";
            sender.append(wordSize).append(word);
        }
        return sender.toString();
    }

    public List<String> decode(String str) {
        List<String> wordList = new ArrayList<>();
        int i= 0;
        while(i< str.length()){


            //reach the ]
            int j = str.indexOf("]",i);
            // find the index of the int?
            int wordLength = Integer.parseInt(str.substring(i,j));
            i = j+wordLength+1;
            //parse the string to an int
            String word = str.substring(j+1,i);
            wordList.add(word);
            

            //now scan the word and add it to a new array
            //jump to the next and replace i with it 
        }
        return wordList;
              
    }
}
