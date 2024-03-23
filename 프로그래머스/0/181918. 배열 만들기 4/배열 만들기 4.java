import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;

        while(i < arr.length){
            if(stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            } else {
                if(stk.get(stk.size()-1) < arr[i]){
                    stk.add(arr[i]);
                    i++;
                } else {
                    stk.remove(stk.size()-1);
                }
            }
        }

        int[] newArr = stk.stream().mapToInt(Integer::intValue).toArray();
        return newArr;
    }
}
// i < arr.length -> 다음 작업 반복
// stk.length == 0 -> arr[i]를 stk 추가 -> i++
// stk.length != 0 -> stk의 마지막원소 < arr[i] -> arr[i]를 stk의 뒤에 추가 -> i++
// stk.length != 0 -> stk 마지막원소 >= arr[i] -> stk 마지막 원소를 제거