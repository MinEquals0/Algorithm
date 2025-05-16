import java.util.*;

class Solution {
    public long solution(String numbers) {
        
        
        StringBuilder sb = new StringBuilder();
        String[] idx = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String answer = "";
        
        for(char c : numbers.toCharArray()){
            sb.append(c);
            for(int i = 0; i < idx.length; i++){
                if(sb.toString().equals(idx[i])){
                    answer += i;
                    sb.setLength(0);
                }
            }
        }
        
       long result = Long.parseLong(answer);
       
        return result;

        // for(int i = 0; i < idx.length; i++){
        //     numbers = numbers.replace(idx[i], String.valueOf(i));
        // }
        
        // long answer = Long.parseLong(numbers);
        // return answer;
    }
}
