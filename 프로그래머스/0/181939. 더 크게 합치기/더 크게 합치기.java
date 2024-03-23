class Solution {
    public int solution(int a, int b) {
        String answer1 = String.valueOf(a) + String.valueOf(b);
        String answer2 = String.valueOf(b) + String.valueOf(a);
        
        int result1 = Integer.parseInt(answer1);
        int result2 = Integer.parseInt(answer2);
        
        if(result1 > result2){
            return result1;
        } else {
            return result2;
        }
  
    }
}  
