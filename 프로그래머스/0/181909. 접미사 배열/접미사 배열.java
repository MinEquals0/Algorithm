import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++){
            String s = my_string.substring(i);
            answer[i] = s;
        }
        
        Arrays.sort(answer);
        
        return answer;


        // 정렬 연습
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            list.add(my_string.substring(i));
        }

        // 람다식으로 정렬
        Collections.sort(list, (a,b) -> a.compareTo(b));

        // 리스트 -> 배열 변환
        return list.toArray(new String[0]);
    }
}
