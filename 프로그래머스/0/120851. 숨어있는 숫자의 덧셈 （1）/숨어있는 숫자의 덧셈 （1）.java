import java.util.*;

class Solution {
    public int solution(String my_string) {
        // isDigit() 비교 -> 숫자만 리스트에 저장
        List <Integer> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            
            if(Character.isDigit(c)){
                list.add(c - '0');
            }
        }
        
        int sum = 0;
        for(int i = 0; i < list.size();i++){
            sum += list.get(i);
        }
        
        return sum;
    }
}