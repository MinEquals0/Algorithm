class Solution {
    public int solution(int[] common) {
        int answer = 1;
        int len = common.length - 1;
        int diff1 = common[1] - common[0];
        int diff2 = common[2] - common[1];
        
        if(diff1 == diff2){
            answer = common[len] + diff1 ;
        } else {
            int  ratio = common[1] / common[0];  
            answer *= common[len] * ratio;
        }
        return answer;
    }
}