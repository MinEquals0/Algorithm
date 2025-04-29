class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] answer = new int[length];
        
        int d = direction.equals("right") ? -1 : 1;
        
        for(int i = 0; i < length; i++){
           int idx = (i - d + length) % length;
           answer[idx] = numbers[i]; 
        }
         return answer; 
        
        
    }
}