class Solution {
    public int solution(int[] array, int n) {
        int close = array[0];
        int minDiff = Math.abs(n - array[0]);
        
        for(int i = 1; i < array.length; i++){
            int diff = Math.abs(n - array[i]);
            
            if(diff < minDiff){
                minDiff = diff;
                close = array[i];
            } else if(diff == minDiff && array[i] < close){
                close = array[i];
            }
        }
        
        return close;
    }
}