import java.util.*;
// import java.util.stream.Collectors;

class Solution {
    public String solution(int q, int r, String code) {
        // 1. StringBuilder
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < code.length(); i++){
            if(i % q == r){
                sb.append(code.charAt(i));
            }
        }
        return sb.toString();


        /*
        // 2. 리스트
        ArrayList<Character> list = new ArrayList<>();
        
        for(int i = 0; i < code.length(); i++){
            if(i % q == r){
                list.add(code.charAt(i));
            }
        }
        
        String answer = list.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());
        
        return answer;
        */
        
    }
}
