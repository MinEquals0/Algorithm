class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multi = 1; 
        for(int i : num_list){
            sum += i;
            multi *= i;
        }
        
        int sq = sum * sum;
        
        return multi < sq ? 1 : 0;
    }
}