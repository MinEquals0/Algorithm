import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        // 카운팅 정렬
        // 카운팅할 int 배열을 하나 만듦 - 수가 등장할 때마다 요소를 증가시킴
        // 카운트할 변수 생성
        // num_list 배열을 for문 돌면서 요소 카운트
        // 카운트한 배열을 for문으로 돌면서 5만큼만 요소를 저장 - 새 배열 생성

        int[] countArr = new int[101]; // 실수!
        int[] result = new int[5];
        int idx = 0;

        for(int i = 0; i < num_list.length; i++){
            countArr[num_list[i]]++;
        }

        // 반복문에 이름을 줄 수 있음
        a:
        for(int i = 1; i < countArr.length; i++){
            // 요소가 0이면 넘어가고, 요소가 있다면 5개까지만 값을 가져옴
            if(countArr[i] != 0){
                for(int j = 0; j < countArr[i]; j++){
                    result[idx++] = i;
                    if(idx == 5) {
                        break a;
                    }
                }
            }
        }
        return result;
    
    }
}