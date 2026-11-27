class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> holder = new ArrayDeque<>();
        int[] freq = new int[temperatures.length];
        for(int i = 0; i<temperatures.length;i++){
            int current = temperatures[i];
            
            while(!(holder.isEmpty()) && current > temperatures[holder.peek()]){
                int previous = holder.pop();
                freq[previous] = i-previous;
            }
            
            holder.push(i);

        }
        return freq;
    }
}
