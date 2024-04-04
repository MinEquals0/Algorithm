import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        // 배열 돌면서 contains "ad" 있는지 비교 -> false 일 때 리스트에 저장
        // 리스트 생성
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].contains("ad")){
                list.add(strArr[i]);
            }
        }
        return list.toArray(new String[]{});
    }
}