import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> al = new ArrayList<>();

        // my_string 문자열 앞에서 인덱스 하나씩 제거 - arraylist에 저장
        int len = my_string.length();
        for(int i = 0; i < len; i++){
            String str = my_string.substring(i,len);
            al.add(str);
        }
        // 정렬
        Collections.sort(al);

        // arraylist -> array
        String[] result = al.stream().toArray(String[]::new);
        return result;
    }
}