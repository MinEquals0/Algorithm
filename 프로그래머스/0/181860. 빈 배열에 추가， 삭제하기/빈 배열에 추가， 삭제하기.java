import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        // flag 배열을 돌면서 if문으로 t / f
        // t 인 경우, arr[i] * 2 -> for문 돌면서 Arraylist에 추가 - list 생성하기
        // f 인 경우, list에서 마지막부터 arr[i]개의 원소 제거
        // list 리턴
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < flag.length ; i++){
            if(flag[i]) {
               int len = arr[i] * 2;
               for(int j = 0; j < len; j++){
                    list.add(arr[i]);
               }
            } else {
                int listLen = list.size()-1; // list 길이
                for(int j = listLen; j > (listLen - arr[i]); j--){
                    list.remove(j);
                }
            }
        }
        return list.stream().mapToInt(t -> t).toArray();
    }
}