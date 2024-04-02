import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        // 배열을 5개씩 묶어서 각 묶음에서 가장 앞에 있는 이름만 리턴
        // for문 돌면서 i를 5씩 증가했을 때 요소만 저장
        // 요소를 저장할 String 배열을 만들기

        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < names.length; i += 5){
            list.add(names[i]);
        }

        return list.toArray(new String[]{});
    }
}