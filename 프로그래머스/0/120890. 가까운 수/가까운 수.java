class Solution {
    public int solution(int[] array, int n) {
        int close = array[0];
        int minDiff = Math.abs(n - array[0]);
        
        for(int i = 1; i < array.length; i++){
            int diff = Math.abs(n - array[i]);
            
            if(diff < minDiff){
                minDiff = diff;
                close = array[i];
            } else if(diff == minDiff && array[i] < close){ // 가까운 수가 여러개 일때는 가장 작은 수
                close = array[i];
            }
        }
        
        return close;
    }
}
