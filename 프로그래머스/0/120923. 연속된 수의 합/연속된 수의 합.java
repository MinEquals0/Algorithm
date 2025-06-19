class Solution {
    public int[] solution(int num, int total) {
        // x + x+1 + ... + x+(num-1) = total
        // num * x + (0 + 1 + ... + num-1)
        // num * x + {num * (num-1)}/2
        
        int[] answer = new int[num];
            
        int x = (total - (num * (num-1)/2)) / num;
         
        for(int i = 0; i < num; i++){
            answer[i] = x + i;
        }
        
        return answer;
    }
}