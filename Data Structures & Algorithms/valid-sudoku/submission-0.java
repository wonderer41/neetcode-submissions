class Solution {
    public boolean isValidSudoku(char[][] board) {

        boolean pong = false;

        HashMap<String,HashSet<Character>> squares = new HashMap<>();
        HashMap<Integer,HashSet<Character>> columns = new HashMap<>();
            int row = 0;

        //check for each row done
        for(char[] rows : board){
            //this is the hash for the rows
            HashSet<Character> temp = new HashSet<>();

            //this checks each row item
            for(int column = 0;column < rows.length; column++){
             char current =rows[column];
                //main rows or columns check later
                if(current != '.'){
                    // add to columns

                    if(!(temp.add(current))){
                        return false;
                    }

                    //subsquare logic
                    //set up key for hashmap
                    StringBuilder key = new StringBuilder();
                    key.append(row/3);
                    key.append(",");
                    key.append(column/3);
                    String keyS = key.toString();

                    //key logic for a new one for columns
                    int keyColumn = column;
                    if(columns.containsKey(keyColumn)){
                        HashSet<Character> content = columns.get(keyColumn);

                        if(!(content.add(current))){
                            return false;
                        }

                    }else{
                        HashSet<Character> content = new HashSet<>();
                        content.add(current);
                        columns.put(keyColumn,content);
                    }

                    
                    //this one checks if the key 
                    if(squares.containsKey(keyS)){
                        HashSet<Character> content = squares.get(keyS);

                        if(!(content.add(current))){
                            return false;
                        }

                    }else{
                        HashSet<Character> content = new HashSet<>();
                        content.add(current);
                        squares.put(keyS,content);
                    }
                }//return of big if 


            }
            //jumps to next row
            row++;
        }
        return true;
    }
}
