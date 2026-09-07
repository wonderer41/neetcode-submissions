

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> groups = new HashMap<>();
        //so we have the map 
        //then we have the transcriber for the string that is the key
        //then we add it to the map
        // and at the end we print the collection
        for(String word : strs){
            int[] keylog = new int[26];
            for(int i = 0; i < word.length(); i++){
                keylog[word.charAt(i) - 'a' ]++;
            }
            String keyfob = Arrays.toString(keylog);
            List<String>bucket = groups.computeIfAbsent(keyfob, k -> new ArrayList<>());
            bucket.add(word);
        }
        return new ArrayList<>(groups.values());
        }
    }

