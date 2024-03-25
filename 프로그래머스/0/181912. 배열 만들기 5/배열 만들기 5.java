import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> al = new ArrayList<>();

        // string 배열을 s 인덱스 ~ l 만큼 자르기
        for(String str : intStrs){
           String newStr = str.substring(s,s+l);
            // 자른 문자열 -> int 변환
           int num = Integer.parseInt(newStr);
            // k < 변환한 숫자
           if(k < num) {
            // 조건에 만족하면 새 배열에 담기 - ArrayList 사용
               al.add(num);
           }
        }
        return al.stream().mapToInt(t -> t).toArray();
    }
}