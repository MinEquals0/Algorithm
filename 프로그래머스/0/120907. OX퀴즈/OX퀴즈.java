import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        // quiz 순회 하면서 요소 하나씩 공백으로 split
        // 답 이 맞는지 확인

        
        // 공백으로 나누고, 공백 제거
        // [[3,-,4,=,-3], [5,+,6,=,11]]
        String[] answer = new String[quiz.length];
        
        String[][] expArr = new String[quiz.length][];
        
        for(int i = 0; i < quiz.length; i++){
            expArr[i] = quiz[i].trim().split("\\s+");
        }
        
        // for문 순회하면서 답 검사
        for(int i = 0; i < expArr.length; i++){ 
            int result = 0;
            int num1 = Integer.parseInt(expArr[i][0]); 
            int num2 = Integer.parseInt(expArr[i][2]); 
            int num3 = Integer.parseInt(expArr[i][4]);
            
            
            // 기호에 따라 분류 +, -
            if(expArr[i][1].equals("+")){
                result = num1 + num2;
            } else {
                result = num1 - num2;
            }
            
            answer[i] = (result == num3) ? "O" : "X";
        }
        
        return answer;
   
    }
}